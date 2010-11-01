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

package org.omg.dds.type.dynamic.modifiable;

import org.omg.dds.core.modifiable.ModifiableValue;
import org.omg.dds.type.dynamic.DynamicType;
import org.omg.dds.type.dynamic.MemberDescriptor;


public interface ModifiableMemberDescriptor
extends MemberDescriptor,
        ModifiableValue<MemberDescriptor, ModifiableMemberDescriptor>
{
    /**
     * @param name the name to set
     */
    public void setName(String name);

    /**
     * @param id the id to set
     */
    public void setId(int id);

    /**
     * @param type the type to set
     */
    public void setType(DynamicType type);

    /**
     * @param defaultValue the defaultValue to set
     */
    public void setDefaultValue(String defaultValue);

    /**
     * @param index the index to set
     */
    public void setIndex(int index);

    /**
     * @param label the label to set
     */
    public void setLabel(int... label);

    /**
     * @param defaultLabel the defaultLabel to set
     */
    public void setDefaultLabel(boolean defaultLabel);
}
