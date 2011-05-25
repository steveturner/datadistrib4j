/* Copyright 2010, Object Management Group, Inc.
 * Copyright 2010, PrismTech, Inc.
 * Copyright 2010, Real-Time Innovations, Inc.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omg.dds.sub;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.omg.dds.core.DomainEntity;
import org.omg.dds.core.Duration;
import org.omg.dds.core.InstanceHandle;
import org.omg.dds.core.NotEnabledException;
import org.omg.dds.core.PreconditionNotMetException;
import org.omg.dds.core.modifiable.ModifiableInstanceHandle;
import org.omg.dds.core.policy.HistoryQosPolicy;
import org.omg.dds.core.status.LivelinessChangedStatus;
import org.omg.dds.core.status.RequestedDeadlineMissedStatus;
import org.omg.dds.core.status.RequestedIncompatibleQosStatus;
import org.omg.dds.core.status.SampleLostStatus;
import org.omg.dds.core.status.SampleRejectedStatus;
import org.omg.dds.core.status.SubscriptionMatchedStatus;
import org.omg.dds.topic.ContentFilteredTopic;
import org.omg.dds.topic.MultiTopic;
import org.omg.dds.topic.PublicationBuiltinTopicData;
import org.omg.dds.topic.Topic;
import org.omg.dds.topic.TopicDescription;


/**
 * A DataReader allows the application (1) to declare the data it wishes to
 * receive (i.e., make a subscription) and (2) to access the data received by
 * the attached {@link Subscriber}.
 * 
 * A DataReader refers to exactly one {@link TopicDescription} (either a
 * {@link Topic}, a {@link ContentFilteredTopic}, or a {@link MultiTopic})
 * that identifies the data to be read. The subscription has a unique
 * resulting type. The data reader may give access to several instances of
 * the resulting type, which can be distinguished from each other by their
 * keys.
 * 
 * All operations except for the inherited operations
 * {@link #setQos(org.omg.dds.core.EntityQos)}, {@link #getQos()},
 * {@link #setListener(java.util.EventListener)}, {@link #getListener()},
 * {@link #enable()}, {@link #getStatusCondition()}, and {@link #close()} may
 * fail with the exception {@link NotEnabledException}.
 * 
 * All sample-accessing operations, namely all variants of {@link #read()} or
 * {@link #take()}, may fail with the exception
 * {@link PreconditionNotMetException}.
 * 
 * <b>Access to the Data</b>
 * 
 * Data is made available to the application by the following operations on
 * DataReader objects: {@link #read()}, {@link #take()}, and the other methods
 * beginning with those prefixes.. The general semantics of the "read"
 * operations is that the application only gets access to the corresponding
 * data; the data remains the middleware's responsibility and can be read
 * again. The semantics of the "take" operations is that the application
 * takes full responsibility for the data; that data will no longer be
 * accessible to the DataReader. Consequently, it is possible for a
 * DataReader to access the same sample multiple times but only if all
 * previous accesses were read operations.
 * 
 * Each of these operations returns an ordered collection of {@link Sample}s
 * (data values and associated meta-information). Each data value represents
 * an atom of data information (i.e., a value for one instance). This
 * collection may contain samples related to the same or different instances
 * (identified by the key). Multiple samples can refer to the same instance
 * if the settings of the {@link HistoryQosPolicy} allow for it.
 * 
 * @param <TYPE>    The concrete type of the data to be read.
 */
public interface DataReader<TYPE>
extends DomainEntity<DataReader<TYPE>,
                     Subscriber,
                     DataReaderListener<TYPE>,
                     DataReaderQos> {
    /**
     * @return  the type parameter if this object's class.
     */
    public Class<TYPE> getType();

    /**
     * Cast this data reader to the given type, or throw an exception if
     * the cast fails.
     * 
     * @param <OTHER>   The type of the data subscribed to by this reader,
     *                  according to the caller.
     * @return          this data reader
     * @throws          ClassCastException if the cast fails
     */
    public <OTHER> DataReader<OTHER> cast();

    public ReadCondition<TYPE> createReadCondition();
    public ReadCondition<TYPE> createReadCondition(
            Collection<SampleState> sampleStates,
            Collection<ViewState> viewStates,
            Collection<InstanceState> instanceStates);

    public QueryCondition<TYPE> createQueryCondition(
            String queryExpression,
            List<String> queryParameters);
    public QueryCondition<TYPE> createQueryCondition(
            Collection<SampleState> sampleStates,
            Collection<ViewState> viewStates,
            Collection<InstanceState> instanceStates,
            String queryExpression,
            List<String> queryParameters);

    public void closeContainedEntities();

    public TopicDescription<TYPE> getTopicDescription();

    public SampleRejectedStatus<TYPE> getSampleRejectedStatus(
            SampleRejectedStatus<TYPE> status);

    public LivelinessChangedStatus<TYPE> getLivelinessChangedStatus(
            LivelinessChangedStatus<TYPE> status);

    public RequestedDeadlineMissedStatus<TYPE>
    getRequestedDeadlineMissedStatus(
            RequestedDeadlineMissedStatus<TYPE> status);

    public RequestedIncompatibleQosStatus<TYPE>
    getRequestedIncompatibleQosStatus(
            RequestedIncompatibleQosStatus<TYPE> status);

    public SubscriptionMatchedStatus<TYPE> getSubscriptionMatchedStatus(
            SubscriptionMatchedStatus<TYPE> status);

    public SampleLostStatus<TYPE> getSampleLostStatus(
            SampleLostStatus<TYPE> status);

    public void waitForHistoricalData(Duration maxWait)
    throws TimeoutException;

    public void waitForHistoricalData(long maxWait, TimeUnit unit)
    throws TimeoutException;

    public Collection<InstanceHandle> getMatchedPublications(
            Collection<InstanceHandle> publicationHandles);
    public PublicationBuiltinTopicData getMatchedPublicationData(
            PublicationBuiltinTopicData publicationData,
            InstanceHandle publicationHandle);


    // --- Type-specific interface: ------------------------------------------

    /**
     * Create and return a new Sample of the same type as may be accessed by
     * this DataReader.
     * 
     * Applications may use this method, for example, to preallocate samples
     * to be overwritten by the <code>read</code> and/or <code>take</code>
     * methods of this interface.
     * 
     * @see #read(List)
     * @see #take(List)
     */
    public Sample<TYPE> createSample();

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> read();
    public Sample.Iterator<TYPE> read(
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    /**
     * Copy samples into the provided collection, overwriting any samples that
     * might already be present.
     */
    public void read(
            List<Sample<TYPE>> samples);
    public void read(
            List<Sample<TYPE>> samples,
            int maxSamples,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> take();
    public Sample.Iterator<TYPE> take(
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    public void take(
            List<Sample<TYPE>> samples);
    public void take(
            List<Sample<TYPE>> samples,
            int maxSamples,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> read(
            ReadCondition<TYPE> condition);

    public void read(
            List<Sample<TYPE>> samples,
            ReadCondition<TYPE> condition);
    public void read(
            List<Sample<TYPE>> samples,
            int maxSamples,
            ReadCondition<TYPE> condition);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> take(
            ReadCondition<TYPE> condition);

    public void take(
            List<Sample<TYPE>> samples,
            ReadCondition<TYPE> condition);
    public void take(
            List<Sample<TYPE>> samples,
            int maxSamples,
            ReadCondition<TYPE> condition);

    /**
     * @return  true if data was read or false if no data was available.
     */
    public boolean readNext(
            Sample<TYPE> sample);

    /**
     * @return  true if data was taken or false if no data was available.
     */
    public boolean takeNext(
            Sample<TYPE> sample);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> read(
            InstanceHandle handle);
    public Sample.Iterator<TYPE> read(
            InstanceHandle handle,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    public void read(
            List<Sample<TYPE>> samples,
            InstanceHandle handle);
    public void read(
            List<Sample<TYPE>> samples,
            InstanceHandle handle,
            int maxSamples,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> take(
            InstanceHandle handle);
    public Sample.Iterator<TYPE> take(
            InstanceHandle handle,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    public void take(
            List<Sample<TYPE>> samples,
            InstanceHandle handle);
    public void take(
            List<Sample<TYPE>> samples,
            InstanceHandle handle,
            int maxSamples,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> readNext(
            InstanceHandle previousHandle);
    public Sample.Iterator<TYPE> readNext(
            InstanceHandle previousHandle,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    public void readNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle);
    public void readNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle,
            int maxSamples,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> takeNext(
            InstanceHandle previousHandle);
    public Sample.Iterator<TYPE> takeNext(
            InstanceHandle previousHandle,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    public void takeNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle);
    public void takeNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle,
            int maxSamples,
            Collection<SampleState> sampleStates, 
            Collection<ViewState> viewStates, 
            Collection<InstanceState> instanceStates);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> readNext(
            InstanceHandle previousHandle,
            ReadCondition<TYPE> condition);

    public void readNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle,
            ReadCondition<TYPE> condition);
    public void readNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle,
            int maxSamples,
            ReadCondition<TYPE> condition);

    /**
     * @return  a non-null unmodifiable iterator over loaned samples.
     */
    public Sample.Iterator<TYPE> takeNext(
            InstanceHandle previousHandle,
            ReadCondition<TYPE> condition);

    public void takeNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle,
            ReadCondition<TYPE> condition);
    public void takeNext(
            List<Sample<TYPE>> samples,
            InstanceHandle previousHandle,
            int maxSamples,
            ReadCondition<TYPE> condition);

    public TYPE getKeyValue(
            TYPE keyHolder, 
            InstanceHandle handle);

    public ModifiableInstanceHandle lookupInstance(
            ModifiableInstanceHandle handle,
            TYPE keyHolder);
}
