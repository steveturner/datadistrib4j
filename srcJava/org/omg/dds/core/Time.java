/* Copyright (c) 2009-2010, Real-Time Innovations, Inc.
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
 * - Neither the name of Real-Time Innovations, Inc. nor the names of its
 *   contributors may be used to endorse or promote products derived from
 *   this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.omg.dds.core;

import java.util.Date;


public interface Time extends ValueType<Time> {
    // -----------------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------------

    public static final int INVALID_SEC = -1;
    public static final int INVALID_NSEC = -1;



    // -----------------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------------

    // --- Data access: ------------------------------------------------------

    /**
     * @param sec the sec to set
     */
    public void setSec(int sec);

    /**
     * @return the sec
     */
    public int getSec();

    /**
     * @param nanosec the nanosec to set
     */
    public void setNanosec(int nanosec);

    /**
     * @return the nanosec
     */
    public int getNanosec();


    // --- Manipulation: -----------------------------------------------------

    public void add(Duration duration);

    public void addSec(int sec);

    public void addNanosec(int nanosec);

    public void addMillis(long millis);


    // --- Conversion: -------------------------------------------------------

    /**
     * Set this Time to the given number of milliseconds.
     */
    public void setTime(long timeMillis);

    /**
     * Set this Time to that described by the given Date.
     * 
     * This method is equivalent to calling
     * <code>setTime(timeDate.getTime())</code>.
     */
    public void setTime(Date timeDate);

    /**
     * @return  the number of milliseconds corresponding to this time,
     *          rounded or truncated to a whole number.
     */
    public long getTime();

}
