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

package org.omg.dds.core.policy.modifiable;

import java.util.concurrent.TimeUnit;

import org.omg.dds.core.Duration;
import org.omg.dds.core.modifiable.ModifiableDuration;
import org.omg.dds.core.policy.DurabilityServiceQosPolicy;
import org.omg.dds.core.policy.HistoryQosPolicy;


public interface ModifiableDurabilityServiceQosPolicy
extends DurabilityServiceQosPolicy,
        ModifiableQosPolicy<DurabilityServiceQosPolicy,
                            ModifiableDurabilityServiceQosPolicy> {
    /**
     * @param serviceCleanupDelay the serviceCleanupDelay to set
     */
    public void setServiceCleanupDelay(Duration serviceCleanupDelay);

    public void setServiceCleanupDelay(
            long serviceCleanupDelay, TimeUnit unit);

    public ModifiableDuration getServiceCleanupDelay();

    /**
     * @param historyKind the historyKind to set
     */
    public void setHistoryKind(HistoryQosPolicy.Kind historyKind);

    /**
     * @param historyDepth the historyDepth to set
     */
    public void setHistoryDepth(int historyDepth);

    /**
     * @param maxSamples the maxSamples to set
     */
    public void setMaxSamples(int maxSamples);

    /**
     * @param maxInstances the maxInstances to set
     */
    public void setMaxInstances(int maxInstances);

    /**
     * @param maxSamplesPerInstance the maxSamplesPerInstance to set
     */
    public void setMaxSamplesPerInstance(int maxSamplesPerInstance);
}