/* Copyright (c) 2009-2010, Real-Time Innovations, Inc.
 * Copyright (c) 2010, Object Management Group, Inc.
 * Copyright (c) 2010, PrismTech, Inc.
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
 * - Neither the names of the above copyright holders nor the names of their
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

package org.omg.dds.topic;

import org.omg.dds.core.Qos;
import org.omg.dds.core.policy.DataRepresentationQosPolicy;
import org.omg.dds.core.policy.DeadlineQosPolicy;
import org.omg.dds.core.policy.DestinationOrderQosPolicy;
import org.omg.dds.core.policy.DurabilityQosPolicy;
import org.omg.dds.core.policy.DurabilityServiceQosPolicy;
import org.omg.dds.core.policy.HistoryQosPolicy;
import org.omg.dds.core.policy.LatencyBudgetQosPolicy;
import org.omg.dds.core.policy.LifespanQosPolicy;
import org.omg.dds.core.policy.LivelinessQosPolicy;
import org.omg.dds.core.policy.OwnershipQosPolicy;
import org.omg.dds.core.policy.ReliabilityQosPolicy;
import org.omg.dds.core.policy.ResourceLimitsQosPolicy;
import org.omg.dds.core.policy.TopicDataQosPolicy;
import org.omg.dds.core.policy.TransportPriorityQosPolicy;
import org.omg.dds.core.policy.TypeConsistencyEnforcementQosPolicy;


public interface TopicQos extends Qos<TopicQos, ModifiableTopicQos> {
    /**
     * @return the topicData
     */
    public TopicDataQosPolicy getTopicData();

    /**
     * @return the durability
     */
    public DurabilityQosPolicy getDurability();

    /**
     * @return the durabilityService
     */
    public DurabilityServiceQosPolicy getDurabilityService();

    /**
     * @return the deadline
     */
    public DeadlineQosPolicy getDeadline();

    /**
     * @return the latencyBudget
     */
    public LatencyBudgetQosPolicy getLatencyBudget();

    /**
     * @return the liveliness
     */
    public LivelinessQosPolicy getLiveliness();

    /**
     * @return the reliability
     */
    public ReliabilityQosPolicy getReliability();

    /**
     * @return the destinationOrder
     */
    public DestinationOrderQosPolicy getDestinationOrder();

    /**
     * @return the history
     */
    public HistoryQosPolicy getHistory();

    /**
     * @return the resourceLimits
     */
    public ResourceLimitsQosPolicy getResourceLimits();

    /**
     * @return the transportPriority
     */
    public TransportPriorityQosPolicy getTransportPriority();

    /**
     * @return the lifespan
     */
    public LifespanQosPolicy getLifespan();

    /**
     * @return the ownership
     */
    public OwnershipQosPolicy getOwnership();

    public DataRepresentationQosPolicy getRepresentation();

    public TypeConsistencyEnforcementQosPolicy getTypeConsistency();
}