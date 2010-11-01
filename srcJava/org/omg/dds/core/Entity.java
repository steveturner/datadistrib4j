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

package org.omg.dds.core;

import java.util.Collection;
import java.util.EventListener;

import org.omg.dds.core.status.Status;


public interface Entity<SELF extends Entity<SELF, LISTENER, QOS>,
                        LISTENER extends EventListener,
                        QOS extends EntityQos<?, ?>>
extends DDSObject
{
    public LISTENER getListener();
    public void setListener(LISTENER listener);

    public QOS getQos();
    public void setQos(QOS qos);
    public void setQos(String qosLibraryName, String qosProfileName);

    public void enable();

    public StatusCondition<SELF> getStatusCondition();

    public Collection<Status.Kind> getStatusChanges(
            Collection<Status.Kind> status);

    public InstanceHandle getInstanceHandle();

    /**
     * Halt communication and dispose the resources held by this entity.
     */
    public void close();

    /**
     * Indicates that references to this object may go out of scope but that
     * the application expects to look it up again later. Therefore, the
     * Service must consider this object to be still in use and may not
     * close it automatically.
     */
    public void retain();
}
