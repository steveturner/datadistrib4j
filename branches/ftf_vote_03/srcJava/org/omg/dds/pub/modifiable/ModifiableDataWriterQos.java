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

package org.omg.dds.pub.modifiable;

import org.omg.dds.core.modifiable.ModifiableEntityQos;
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
import org.omg.dds.core.policy.OwnershipStrengthQosPolicy;
import org.omg.dds.core.policy.ReliabilityQosPolicy;
import org.omg.dds.core.policy.ResourceLimitsQosPolicy;
import org.omg.dds.core.policy.TransportPriorityQosPolicy;
import org.omg.dds.core.policy.TypeConsistencyEnforcementQosPolicy;
import org.omg.dds.core.policy.UserDataQosPolicy;
import org.omg.dds.core.policy.WriterDataLifecycleQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableDataRepresentationQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableDeadlineQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableDestinationOrderQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableDurabilityQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableDurabilityServiceQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableHistoryQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableLatencyBudgetQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableLifespanQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableLivelinessQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableOwnershipQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableOwnershipStrengthQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableReliabilityQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableResourceLimitsQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableTransportPriorityQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableTypeConsistencyEnforcementQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableUserDataQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableWriterDataLifecycleQosPolicy;
import org.omg.dds.pub.DataWriterQos;
import org.omg.dds.topic.TopicQos;


public interface ModifiableDataWriterQos
extends DataWriterQos,
        ModifiableEntityQos<DataWriterQos, ModifiableDataWriterQos>
{
    /**
     * @param durability the durability to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setDurability(
            DurabilityQosPolicy durability);

    /**
     * @return the durability
     */
    public ModifiableDurabilityQosPolicy getDurability();

    /**
     * @param durabilityService the durabilityService to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setDurabilityService(
            DurabilityServiceQosPolicy durabilityService);

    /**
     * @return the durabilityService
     */
    public ModifiableDurabilityServiceQosPolicy getDurabilityService();

    /**
     * @param deadline the deadline to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setDeadline(DeadlineQosPolicy deadline);

    /**
     * @return the deadline
     */
    public ModifiableDeadlineQosPolicy getDeadline();

    /**
     * @param latencyBudget the latencyBudget to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setLatencyBudget(
            LatencyBudgetQosPolicy latencyBudget);

    /**
     * @return the latencyBudget
     */
    public ModifiableLatencyBudgetQosPolicy getLatencyBudget();

    /**
     * @param liveliness the liveliness to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setLiveliness(
            LivelinessQosPolicy liveliness);

    /**
     * @return the liveliness
     */
    public ModifiableLivelinessQosPolicy getLiveliness();

    /**
     * @param reliability the reliability to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setReliability(
            ReliabilityQosPolicy reliability);

    /**
     * @return the reliability
     */
    public ModifiableReliabilityQosPolicy getReliability();

    /**
     * @param destinationOrder the destinationOrder to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setDestinationOrder(
            DestinationOrderQosPolicy destinationOrder);

    /**
     * @return the destinationOrder
     */
    public ModifiableDestinationOrderQosPolicy getDestinationOrder();

    /**
     * @param history the history to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setHistory(HistoryQosPolicy history);

    /**
     * @return the history
     */
    public ModifiableHistoryQosPolicy getHistory();

    /**
     * @param resourceLimits the resourceLimits to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setResourceLimits(
            ResourceLimitsQosPolicy resourceLimits);

    /**
     * @return the resourceLimits
     */
    public ModifiableResourceLimitsQosPolicy getResourceLimits();

    /**
     * @param transportPriority the transportPriority to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setTransportPriority(
            TransportPriorityQosPolicy transportPriority);

    /**
     * @return the transportPriority
     */
    public ModifiableTransportPriorityQosPolicy getTransportPriority();

    /**
     * @param lifespan the lifespan to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setLifespan(LifespanQosPolicy lifespan);

    /**
     * @return the lifespan
     */
    public ModifiableLifespanQosPolicy getLifespan();

    /**
     * @param userData the userData to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setUserData(UserDataQosPolicy userData);

    /**
     * @return the userData
     */
    public ModifiableUserDataQosPolicy getUserData();

    /**
     * @param ownership the ownership to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setOwnership(OwnershipQosPolicy ownership);

    /**
     * @return the ownership
     */
    public ModifiableOwnershipQosPolicy getOwnership();

    /**
     * @param ownershipStrength the ownershipStrength to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setOwnershipStrength(
            OwnershipStrengthQosPolicy ownershipStrength);

    /**
     * @return the ownershipStrength
     */
    public ModifiableOwnershipStrengthQosPolicy getOwnershipStrength();

    /**
     * @param writerDataLifecycle the writerDataLifecycle to set
     * 
     * @return  this
     */
    public ModifiableDataWriterQos setWriterDataLifecycle(
            WriterDataLifecycleQosPolicy writerDataLifecycle);

    /**
     * @return the writerDataLifecycle
     */
    public ModifiableWriterDataLifecycleQosPolicy getWriterDataLifecycle();

    public ModifiableDataRepresentationQosPolicy getRepresentation();

    /**
     * @return  this
     */
    public ModifiableDataWriterQos setRepresentation(
            DataRepresentationQosPolicy representation);

    public ModifiableTypeConsistencyEnforcementQosPolicy getTypeConsistency();

    /**
     * @return  this
     */
    public ModifiableDataWriterQos setTypeConsistency(
            TypeConsistencyEnforcementQosPolicy typeConsistency);

    public ModifiableDataWriterQos copyFrom(TopicQos src);
}