/* Copyright (c) 2009, Real-Time Innovations, Inc.
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

package org.omg.dds.domain;

import java.util.Set;

import org.omg.dds.infrastructure.Status;
import org.omg.dds.spi.ServiceImpl;


/**
 * DDS/DomainParticipantFactory.java .
 * Generated by the IDL-to-Java compiler (portable), version "3.2"
 * from dds_rtf2_dcps.idl
 * Wednesday, September 16, 2009 9:06:02 AM CDT
 */
public abstract class DomainParticipantFactory {
    // -----------------------------------------------------------------------
    // Object Lifecycle
    // -----------------------------------------------------------------------

    public static DomainParticipantFactory getInstance() {
        DomainParticipantFactory factory =
            ServiceImpl.getInstance().getParticipantFactory();
        assert factory != null;
        return factory;
    }



    // -----------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------

    /**
     * Create a new participant in the domain with ID 0 having default QoS
     * and no listener.
     */
    public abstract DomainParticipant createParticipant();
    public abstract DomainParticipant createParticipant(
            int domainId,
            DomainParticipantQos qos,
            DomainParticipantListener listener);
    public abstract DomainParticipant createParticipant(
            int domainId,
            DomainParticipantQos qos,
            DomainParticipantListener listener,
            Set<Status.Kind<?>> status);

    public abstract DomainParticipant lookupParticipant(int domainId);

    public abstract DomainParticipantFactoryQos cloneQos();
    public abstract void getQos(DomainParticipantFactoryQos qos);
    public abstract void setQos(DomainParticipantFactoryQos qos);

    public abstract DomainParticipantQos cloneDefaultParticipantQos();
    public abstract void getDefaultParticipantQos(DomainParticipantQos qos);
    public abstract void setDefaultParticipantQos(DomainParticipantQos qos);

}