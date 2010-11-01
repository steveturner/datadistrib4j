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

import org.omg.dds.core.Bootstrap;
import org.omg.dds.core.ModifiableInstanceHandle;
import org.omg.dds.core.Status;


public abstract class PublicationMatchedStatus<TYPE>
extends Status<PublicationMatchedStatus<TYPE>, DataWriter<TYPE>> {
    // -----------------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------------

    private static final long serialVersionUID = -2133794660702966974L;



    // -----------------------------------------------------------------------
    // Object Life Cycle
    // -----------------------------------------------------------------------

    /**
     * @param bootstrap Identifies the Service instance to which the new
     *                  object will belong.
     */
    public static <TYPE> PublicationMatchedStatus<TYPE>
    newPublicationMatchedStatus(Bootstrap bootstrap) {
        return bootstrap.getSPI().newPublicationMatchedStatus();
    }


    // -----------------------------------------------------------------------

    protected PublicationMatchedStatus(DataWriter<TYPE> source) {
        super(source);
    }



    // -----------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------

    /**
     * @return the totalCount
     */
    public abstract int getTotalCount();

    /**
     * @return the totalCountChange
     */
    public abstract int getTotalCountChange();

    /**
     * @return the currentCount
     */
    public abstract int getCurrentCount();

    /**
     * @return the currentCountChange
     */
    public abstract int getCurrentCountChange();

    public abstract ModifiableInstanceHandle getLastSubscriptionHandle();

}
