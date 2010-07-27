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

import java.util.Collection;
import java.util.concurrent.TimeoutException;

import org.omg.dds.core.DomainEntity;
import org.omg.dds.core.Duration;
import org.omg.dds.core.Status;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.topic.Topic;
import org.omg.dds.topic.TopicQos;
import org.omg.dds.type.builtin.BytesDataWriter;
import org.omg.dds.type.builtin.KeyedBytes;
import org.omg.dds.type.builtin.KeyedBytesDataWriter;
import org.omg.dds.type.builtin.KeyedString;
import org.omg.dds.type.builtin.KeyedStringDataWriter;
import org.omg.dds.type.builtin.StringDataWriter;


public interface Publisher
extends DomainEntity<Publisher,
                     DomainParticipant,
                     PublisherListener,
                     PublisherQos>
{
    // --- Create (any) DataWriter: ------------------------------------------

    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            DataWriterQos qos);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            DataWriterQos qos,
            DataWriterListener<TYPE> listener);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            DataWriterQos qos,
            DataWriterListener<TYPE> listener,
            Collection<Status.Kind> status);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            String qosLibraryName,
            String qosProfileName);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<TYPE> listener);
    public <TYPE> DataWriter<TYPE> createDataWriter(
            Topic<TYPE> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<TYPE> listener,
            Collection<Status.Kind> status);


    // --- Create DataWriter for built-in bytes type: ------------------------

    public BytesDataWriter createDataWriter(
            Topic<byte[]> topic);
    public BytesDataWriter createDataWriter(
            Topic<byte[]> topic,
            DataWriterQos qos);
    public BytesDataWriter createDataWriter(
            Topic<byte[]> topic,
            DataWriterQos qos,
            DataWriterListener<byte[]> listener);
    public BytesDataWriter createDataWriter(
            Topic<byte[]> topic,
            DataWriterQos qos,
            DataWriterListener<byte[]> listener,
            Collection<Status.Kind> status);
    public BytesDataWriter createDataWriter(
            Topic<byte[]> topic,
            String qosLibraryName,
            String qosProfileName);
    public BytesDataWriter createDataWriter(
            Topic<byte[]> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<byte[]> listener);
    public BytesDataWriter createDataWriter(
            Topic<byte[]> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<byte[]> listener,
            Collection<Status.Kind> status);


    // --- Create DataWriter for built-in KeyedBytes type: -------------------

    public KeyedBytesDataWriter createDataWriter(
            Topic<KeyedBytes> topic);
    public KeyedBytesDataWriter createDataWriter(
            Topic<KeyedBytes> topic,
            DataWriterQos qos);
    public KeyedBytesDataWriter createDataWriter(
            Topic<KeyedBytes> topic,
            DataWriterQos qos,
            DataWriterListener<KeyedBytes> listener);
    public KeyedBytesDataWriter createDataWriter(
            Topic<KeyedBytes> topic,
            DataWriterQos qos,
            DataWriterListener<KeyedBytes> listener,
            Collection<Status.Kind> status);
    public KeyedBytesDataWriter createDataWriter(
            Topic<KeyedBytes> topic,
            String qosLibraryName,
            String qosProfileName);
    public KeyedBytesDataWriter createDataWriter(
            Topic<KeyedBytes> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<KeyedBytes> listener);
    public KeyedBytesDataWriter createDataWriter(
            Topic<KeyedBytes> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<KeyedBytes> listener,
            Collection<Status.Kind> status);


    // --- Create DataWriter for built-in string type: -----------------------

    public StringDataWriter createDataWriter(
            Topic<String> topic);
    public StringDataWriter createDataWriter(
            Topic<String> topic,
            DataWriterQos qos);
    public StringDataWriter createDataWriter(
            Topic<String> topic,
            DataWriterQos qos,
            DataWriterListener<String> listener);
    public StringDataWriter createDataWriter(
            Topic<String> topic,
            DataWriterQos qos,
            DataWriterListener<String> listener,
            Collection<Status.Kind> status);
    public StringDataWriter createDataWriter(
            Topic<String> topic,
            String qosLibraryName,
            String qosProfileName);
    public StringDataWriter createDataWriter(
            Topic<String> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<String> listener);
    public StringDataWriter createDataWriter(
            Topic<String> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<String> listener,
            Collection<Status.Kind> status);


    // --- Create DataWriter for built-in KeyedString type: ------------------

    public KeyedStringDataWriter createDataWriter(
            Topic<KeyedString> topic);
    public KeyedStringDataWriter createDataWriter(
            Topic<KeyedString> topic,
            DataWriterQos qos);
    public KeyedStringDataWriter createDataWriter(
            Topic<KeyedString> topic,
            DataWriterQos qos,
            DataWriterListener<KeyedString> listener);
    public KeyedStringDataWriter createDataWriter(
            Topic<KeyedString> topic,
            DataWriterQos qos,
            DataWriterListener<KeyedString> listener,
            Collection<Status.Kind> status);
    public KeyedStringDataWriter createDataWriter(
            Topic<KeyedString> topic,
            String qosLibraryName,
            String qosProfileName);
    public KeyedStringDataWriter createDataWriter(
            Topic<KeyedString> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<KeyedString> listener);
    public KeyedStringDataWriter createDataWriter(
            Topic<KeyedString> topic,
            String qosLibraryName,
            String qosProfileName,
            DataWriterListener<KeyedString> listener,
            Collection<Status.Kind> status);


    // --- Lookup operations: ------------------------------------------------

    public <TYPE> DataWriter<TYPE> lookupDataWriter(String topicName);
    public <TYPE> DataWriter<TYPE> lookupDataWriter(Topic<TYPE> topicName);
    public BytesDataWriter lookupDataWriter(Topic<byte[]> topicName);
    public KeyedBytesDataWriter lookupDataWriter(Topic<KeyedBytes> topicName);
    public StringDataWriter lookupDataWriter(Topic<String> topicName);
    public KeyedStringDataWriter lookupDataWriter(
            Topic<KeyedString> topicName);


    // --- Other operations: -------------------------------------------------

    public void closeContainedEntities();

    public void suspendPublications();
    public void resumePublications();

    public void beginCoherentChanges();
    public void endCoherentChanges();

    public void waitForAcknowledgments(Duration maxWait)
    throws TimeoutException;

    public void waitForAcknowledgments(long maxWaitMillis)
    throws TimeoutException;

    public DataWriterQos getDefaultDataWriterQos();
    public void setDefaultDataWriterQos(DataWriterQos qos);
    public void setDefaultDataWriterQos(
            String qosLibraryName,
            String qosProfileName);

    public void copyFromTopicQos(DataWriterQos dst, TopicQos src);
}
