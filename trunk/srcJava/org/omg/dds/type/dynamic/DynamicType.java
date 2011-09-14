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

package org.omg.dds.type.dynamic;

import java.util.List;
import java.util.Map;

import org.omg.dds.core.DDSObject;
import org.omg.dds.type.TypeKind;


public interface DynamicType extends DDSObject, Cloneable
{
    public TypeDescriptor getDescriptor();

    public String getName();

    public TypeKind getKind();

    public DynamicTypeMember getMember(int id);

    public Map<Integer, DynamicTypeMember> getAllMembers();

    public DynamicTypeMember getMemberByName(String name);

    public Map<String, DynamicTypeMember> getAllMembersByName();

    public List<AnnotationDescriptor> getAnnotations();

    public void applyAnnotation(AnnotationDescriptor descriptor);

    public DynamicTypeMember addMember(MemberDescriptor descriptor);

    public DynamicType clone();
}
