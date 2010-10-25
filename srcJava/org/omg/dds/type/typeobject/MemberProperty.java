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

import org.omg.dds.core.ModifiableValue;
import org.omg.dds.type.annotation.Extensibility;
import org.omg.dds.type.annotation.Nested;


@Extensibility(Extensibility.Kind.EXTENSIBLE_EXTENSIBILITY)
@Nested
public interface MemberProperty
extends ModifiableValue<MemberProperty, MemberProperty>
{
    /**
     * @param flag the flag to set
     */
    public void setFlag(MemberFlag flag);

    /**
     * @return the flag
     */
    public MemberFlag getFlag();

    /**
     * @param memberId the memberId to set
     */
    public void setMemberId(int memberId);

    /**
     * @return the memberId
     */
    public int getMemberId();

    /**
     * @param type the type to set
     */
    public void setType(int type);

    /**
     * @return the type
     */
    public int getType();

    /**
     * @param name the name to set
     */
    public void setName(String name);

    /**
     * @return the name
     */
    public String getName();
}
