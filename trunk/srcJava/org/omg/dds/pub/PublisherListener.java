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

package org.omg.dds.pub;

import java.util.EventListener;

import org.omg.dds.core.Entity;
import org.omg.dds.core.status.LivelinessLostStatus;
import org.omg.dds.core.status.OfferedDeadlineMissedStatus;
import org.omg.dds.core.status.OfferedIncompatibleQosStatus;
import org.omg.dds.core.status.PublicationMatchedStatus;


/**
 * Since a {@link Publisher} is a kind of {@link Entity}, it has the ability
 * to have a listener associated with it. In this case, the associated
 * listener must be of concrete type PublisherListener.
 */
public interface PublisherListener extends EventListener {
    public void onOfferedDeadlineMissed(
            OfferedDeadlineMissedStatus<?> status);

    public void onOfferedIncompatibleQos(
            OfferedIncompatibleQosStatus<?> status);

    public void onLivelinessLost(LivelinessLostStatus<?> status);

    public void onPublicationMatched(PublicationMatchedStatus<?> status);
}