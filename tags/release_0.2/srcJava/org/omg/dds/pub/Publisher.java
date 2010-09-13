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

package org.omg.dds.pub;

import java.util.Set;

import org.omg.dds.core.DomainEntity;
import org.omg.dds.core.Duration;
import org.omg.dds.core.Status;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.topic.Topic;
import org.omg.dds.topic.TopicQos;


public interface Publisher
extends DomainEntity<Publisher,
                     DomainParticipant,
                     PublisherListener,
                     PublisherQos> {
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            DataWriterQos qos);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            DataWriterQos qos,
            DataWriterListener listener);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            DataWriterQos qos,
            DataWriterListener listener,
            Set<Status.Kind> status);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            String qosLibraryName,
            String qosProfileName);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener listener);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener listener,
            Set<Status.Kind> status);

    public <TYPE> DataWriter<TYPE> lookupDataWriter(String topicName);
    public <TYPE> DataWriter<TYPE> lookupDataWriter(Topic<TYPE> topicName);

    public void closeContainedEntities();

    public void suspendPublications();
    public void resumePublications();

    public void beginCoherentChanges();
    public void endCoherentChanges();

    public void waitForAcknowledgments(Duration maxWait);
    public void waitForAcknowledgments(long maxWaitMillis);

    public void cloneDefaultDataWriterQos(DataWriterQos qos);
    public void getDefaultDataWriterQos(DataWriterQos qos);
    public void setDefaultDataWriterQos(DataWriterQos qos);
    public void setDefaultDataWriterQos(
            String qosLibraryName,
            String qosProfileName);

    public void copyFromTopicQos(DataWriterQos dst, TopicQos src);
}