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

package org.omg.dds.type.typeobject;

import java.util.List;

import org.omg.dds.type.Extensibility;
import org.omg.dds.type.ID;
import org.omg.dds.type.Nested;


@Extensibility(Extensibility.Kind.MUTABLE_EXTENSIBILITY)
@Nested
public interface BitSetType extends Type
{
    @ID(MemberId.BIT_BOUND_BITSETTYPE_MEMBER_ID)
    public int getBitBound();

    /**
     * @return  this
     */
    public BitSetType setBitBound(int newBitBound);

    @ID(MemberId.BIT_BITSETTYPE_MEMBER_ID)
    public List<Bit> getBit();

    /**
     * @return  this
     */
    public BitSetType setBit(List<Bit> newBit);



    // -----------------------------------------------------------------------
    // Types
    // -----------------------------------------------------------------------

    public static final class MemberId
    {
        // --- Constants: ----------------------------------------------------
        public static final int BIT_BOUND_BITSETTYPE_MEMBER_ID = 100;
        public static final int BIT_BITSETTYPE_MEMBER_ID = 101;

        // --- Constructor: --------------------------------------------------
        private MemberId() {
            // empty
        }
    }
}
