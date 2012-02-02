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

package org.omg.dds.core.policy;

import org.omg.dds.core.Entity;
import org.omg.dds.domain.DomainParticipant;
import org.omg.dds.domain.DomainParticipantFactory;
import org.omg.dds.pub.DataWriter;
import org.omg.dds.pub.Publisher;
import org.omg.dds.sub.DataReader;
import org.omg.dds.sub.Subscriber;
import org.omg.dds.topic.Topic;


/**
 * Controls the behavior of the {@link Entity} when acting as a factory for
 * other entities. In other words, configures the side-effects of the
 * <code>create_*</code> operations.
 * 
 * <b>Concerns:</b> {@link DomainParticipantFactory},
 *                  {@link DomainParticipant}, {@link Publisher},
 *                  {@link Subscriber}
 * 
 * <b>RxO:</b> No
 * 
 * <b>Changeable:</b> Yes
 * 
 * This policy controls the behavior of the Entity as a factory for other entities.
 * 
 * This policy concerns only DomainParticipant (as factory for Publisher,
 * Subscriber, and {@link Topic}), Publisher (as factory for
 * {@link DataWriter}), and Subscriber (as factory for {@link DataReader}).
 * 
 * This policy is mutable. A change in the policy affects only the entities
 * created after the change; not the previously created entities.
 *  
 * The setting of autoenableCreatedEntities to true indicates that the
 * factory <code>create&lt;<i>entity</i>&gt;</code> operation will
 * automatically invoke the {@link Entity#enable()} operation each time a new
 * Entity is created. Therefore, the Entity returned by
 * <code>create&lt;<i>entity</i>&gt;</code> will already be enabled. A
 * setting of false indicates that the Entity will not be automatically
 * enabled. The application will need to enable it explicitly by means of the
 * enable operation.
 * 
 * The default setting of autoenableCreatedEntities = true means that, by
 * default, it is not necessary to explicitly call enable on newly created
 * entities.
 */
public interface EntityFactoryQosPolicy extends QosPolicy
{
    /**
     * @return the autoEnableCreatedEntities
     */
    public boolean isAutoEnableCreatedEntities();


    // --- Modification: -----------------------------------------------------

    /**
     * Copy this policy and override the value of the property.
     * 
     * @return  a new policy
     */
    public EntityFactoryQosPolicy withAutoEnableCreatedEntities(
            boolean autoEnableCreatedEntities);
}
