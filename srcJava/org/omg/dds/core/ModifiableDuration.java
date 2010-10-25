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

import java.util.concurrent.TimeUnit;


public interface ModifiableDuration
extends Duration, ModifiableValue<Duration, ModifiableDuration>
{
    // -----------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------

    // --- Data access: ------------------------------------------------------

    public void setDuration(long duration, TimeUnit unit);


    // --- Manipulation: -----------------------------------------------------

    /**
     * Increase this duration by the given amount.
     */
    public void add(Duration duration);

    /**
     * Increase this duration by the given amount.
     */
    public void add(long duration, TimeUnit unit);

    /**
     * Decrease this duration by the given amount.
     */
    public void subtract(Duration duration);

    /**
     * Decrease this duration by the given amount.
     */
    public void subtract(long duration, TimeUnit unit);
}
