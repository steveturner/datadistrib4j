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

package org.omg.dds.domain.modifiable;

import org.omg.dds.core.modifiable.ModifiableEntityQos;
import org.omg.dds.core.policy.EntityFactoryQosPolicy;
import org.omg.dds.core.policy.UserDataQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableEntityFactoryQosPolicy;
import org.omg.dds.core.policy.modifiable.ModifiableUserDataQosPolicy;
import org.omg.dds.domain.DomainParticipantQos;


public interface ModifiableDomainParticipantQos
extends DomainParticipantQos,
        ModifiableEntityQos<DomainParticipantQos,
                            ModifiableDomainParticipantQos>
{
    /**
     * @param userData the userData to set
     */
    public void setUserData(UserDataQosPolicy userData);

    /**
     * @return the userData
     */
    public ModifiableUserDataQosPolicy getUserData();

    /**
     * @param entityFactory the entityFactory to set
     */
    public void setEntityFactory(EntityFactoryQosPolicy entityFactory);

    /**
     * @return the entityFactory
     */
    public ModifiableEntityFactoryQosPolicy getEntityFactory();

}
