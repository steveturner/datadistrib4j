/* Copyright (c) 2009-2010, Real-Time Innovations, Inc.
 * Copyright (c) 2010, Object Management Group, Inc.
 * Copyright (c) 2010, PrismTech, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 * - Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * - Neither the names of the above copyright holders nor the names of their
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL A COPYRIGHT HOLDER OR CONTRIBUTOR BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.omg.dds.core;

import java.io.Serializable;


/**
 * Implementing classes have value semantics: they can be deeply copied, and
 * equality is determined based on their contents, not on their object
 * identity.
 */
public interface Value<UNMOD_SELF extends Value<UNMOD_SELF, MOD_SELF>,
                           MOD_SELF extends UNMOD_SELF>
extends DdsObject, Cloneable, Serializable {
    // --- From Object: ------------------------------------------------------

    /**
     * Implementing classes should override <code>equals()</code>.
     */
    @Override
    public boolean equals(Object other);

    /**
     * Implementing classes should override <code>hashCode()</code>.
     */
    @Override
    public int hashCode();

    /**
     * Extends the concept of "cloneable" defined in <code>java.lang</code> by
     * providing an explicit public {@link #clone()} method.
     * 
     * @return  a new object that with state identical to that of this object.
     */
    public UNMOD_SELF clone();


    // --- Conversion: -------------------------------------------------------

    /**
     * If this value type is of a modifiable subtype, return this.
     * If this value type has a modifiable subtype, return a new object
     * of that type that is a modifiable copy of this object.
     * Otherwise, return null.
     * 
     * @return  <code>this</code>, a new modifiable copy of <code>this</code>,
     *          or <code>null</code>.
     */
    public MOD_SELF modify();
}
