/* Copyright (c) 2009-2010, Real-Time Innovations, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * - Neither the name of Real-Time Innovations, Inc. nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.omg.dds.sub;

import java.util.Collection;

import org.omg.dds.core.DomainEntity;
import org.omg.dds.core.Status;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.topic.TopicDescription;
import org.omg.dds.topic.TopicQos;
import org.omg.dds.type.builtin.BytesDataReader;
import org.omg.dds.type.builtin.KeyedBytes;
import org.omg.dds.type.builtin.KeyedBytesDataReader;
import org.omg.dds.type.builtin.KeyedString;
import org.omg.dds.type.builtin.KeyedStringDataReader;
import org.omg.dds.type.builtin.StringDataReader;


public interface Subscriber
extends DomainEntity<Subscriber,
                     DomainParticipant,
                     SubscriberListener,
                     SubscriberQos>
{
    // --- Create (any) DataReader: ------------------------------------------

    public <TYPE> DataReader<TYPE> createDataReader(
            TopicDescription<TYPE> topic);
    public <TYPE> DataReader<TYPE> createDataReader(
            TopicDescription<TYPE> topic,
            DataReaderQos qos);
    public <TYPE> DataReader<TYPE> createDataReader(
            TopicDescription<TYPE> topic,
            DataReaderQos qos,
            DataReaderListener<TYPE> listener);
    public <TYPE> DataReader<TYPE> createDataReader(
            TopicDescription<TYPE> topic,
            DataReaderQos qos,
            DataReaderListener<TYPE> listener,
            Collection<Status.Kind> statuses);
    public <TYPE> DataReader<TYPE> createDataReader(
            TopicDescription<TYPE> topic,
            String qosLibraryName,
            String qosProfileName);
    public <TYPE> DataReader<TYPE> createDataReader(
            TopicDescription<TYPE> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<TYPE> listener);
    public <TYPE> DataReader<TYPE> createDataReader(
            TopicDescription<TYPE> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<TYPE> listener,
            Collection<Status.Kind> statuses);


    // --- Create DataReader of built-in bytes type: -------------------------

    public BytesDataReader createDataReader(
            TopicDescription<byte[]> topic);
    public BytesDataReader createDataReader(
            TopicDescription<byte[]> topic,
            DataReaderQos qos);
    public BytesDataReader createDataReader(
            TopicDescription<byte[]> topic,
            DataReaderQos qos,
            DataReaderListener<byte[]> listener);
    public BytesDataReader createDataReader(
            TopicDescription<byte[]> topic,
            DataReaderQos qos,
            DataReaderListener<byte[]> listener,
            Collection<Status.Kind> statuses);
    public BytesDataReader createDataReader(
            TopicDescription<byte[]> topic,
            String qosLibraryName,
            String qosProfileName);
    public BytesDataReader createDataReader(
            TopicDescription<byte[]> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<byte[]> listener);
    public BytesDataReader createDataReader(
            TopicDescription<byte[]> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<byte[]> listener,
            Collection<Status.Kind> statuses);


    // --- Create DataReader of built-in KeyedString type: -------------------

    public KeyedBytesDataReader createDataReader(
            TopicDescription<KeyedBytes> topic);
    public KeyedBytesDataReader createDataReader(
            TopicDescription<KeyedBytes> topic,
            DataReaderQos qos);
    public KeyedBytesDataReader createDataReader(
            TopicDescription<KeyedBytes> topic,
            DataReaderQos qos,
            DataReaderListener<KeyedBytes> listener);
    public KeyedBytesDataReader createDataReader(
            TopicDescription<KeyedBytes> topic,
            DataReaderQos qos,
            DataReaderListener<KeyedBytes> listener,
            Collection<Status.Kind> statuses);
    public KeyedBytesDataReader createDataReader(
            TopicDescription<KeyedBytes> topic,
            String qosLibraryName,
            String qosProfileName);
    public KeyedBytesDataReader createDataReader(
            TopicDescription<KeyedBytes> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<KeyedBytes> listener);
    public KeyedBytesDataReader createDataReader(
            TopicDescription<KeyedBytes> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<KeyedBytes> listener,
            Collection<Status.Kind> statuses);


    // --- Create DataReader of built-in string type: ------------------------

    public StringDataReader createDataReader(
            TopicDescription<String> topic);
    public StringDataReader createDataReader(
            TopicDescription<String> topic,
            DataReaderQos qos);
    public StringDataReader createDataReader(
            TopicDescription<String> topic,
            DataReaderQos qos,
            DataReaderListener<String> listener);
    public StringDataReader createDataReader(
            TopicDescription<String> topic,
            DataReaderQos qos,
            DataReaderListener<String> listener,
            Collection<Status.Kind> statuses);
    public StringDataReader createDataReader(
            TopicDescription<String> topic,
            String qosLibraryName,
            String qosProfileName);
    public StringDataReader createDataReader(
            TopicDescription<String> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<String> listener);
    public StringDataReader createDataReader(
            TopicDescription<String> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<String> listener,
            Collection<Status.Kind> statuses);


    // --- Create DataReader of built-in KeyedString type: -------------------

    public KeyedStringDataReader createDataReader(
            TopicDescription<KeyedString> topic);
    public KeyedStringDataReader createDataReader(
            TopicDescription<KeyedString> topic,
            DataReaderQos qos);
    public KeyedStringDataReader createDataReader(
            TopicDescription<KeyedString> topic,
            DataReaderQos qos,
            DataReaderListener<KeyedString> listener);
    public KeyedStringDataReader createDataReader(
            TopicDescription<KeyedString> topic,
            DataReaderQos qos,
            DataReaderListener<KeyedString> listener,
            Collection<Status.Kind> statuses);
    public KeyedStringDataReader createDataReader(
            TopicDescription<KeyedString> topic,
            String qosLibraryName,
            String qosProfileName);
    public KeyedStringDataReader createDataReader(
            TopicDescription<KeyedString> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<KeyedString> listener);
    public KeyedStringDataReader createDataReader(
            TopicDescription<KeyedString> topic,
            String qosLibraryName,
            String qosProfileName,
            DataReaderListener<KeyedString> listener,
            Collection<Status.Kind> statuses);


    // --- Lookup operations: ------------------------------------------------

    public <TYPE> DataReader<TYPE> lookupDataReader(String topicName);
    public <TYPE> DataReader<TYPE> lookupDataReader(
            TopicDescription<TYPE> topicName);
    public BytesDataReader lookupDataReader(
            TopicDescription<byte[]> topicName);
    public KeyedBytesDataReader lookupDataReader(
            TopicDescription<KeyedBytes> topicName);
    public StringDataReader lookupDataReader(
            TopicDescription<String> topicName);
    public KeyedStringDataReader lookupDataReader(
            TopicDescription<KeyedString> topicName);


    // --- Other operations: -------------------------------------------------

    public void closeContainedEntities();

    public void getDataReaders(
            Collection<DataReader<?>> readers);
    public void getDataReaders(
            Collection<DataReader<?>> readers,
            Collection<SampleState> sampleStates,
            Collection<ViewState> viewStates,
            Collection<InstanceState> instanceStates);

    public void notifyDataReaders();

    public void beginAccess();
    public void endAccess();

    public DataReaderQos getDefaultDataReaderQos();
    public void setDefaultDataReaderQos(DataReaderQos qos);
    public void setDefaultDataReaderQos(
            String qosLibraryName,
            String qosProfileName);

    public void copyFromTopicQos(DataReaderQos dst, TopicQos src);
}
