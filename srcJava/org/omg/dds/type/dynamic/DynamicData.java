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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import org.omg.dds.core.DDSObject;


public interface DynamicData extends DDSObject, Cloneable
{
    public DynamicType getType();

    /**
     * Modifying an element of the given list modifies the descriptor of this
     * DynamicData object, not a copy. Adding to or removing from the list
     * is not allowed.
     */
    public List<MemberDescriptor> getDescriptors();

    int getMemberIdByName(String name);
    int getMemberIdAtIndex(int index);


    public void clearAllValues();
    public void clearNonkeyValues();
    public void clearValue(int id);


    public DynamicData loanValue(int id);
    public void returnLoanedValue(DynamicData value);


    public int getInt32Value(int id);
    public void setInt32Value(int id, int value);

    public short getInt16Value(int id);
    public void setInt16Value(int id, short value);

    public long getInt64Value(int id);
    public void setInt64Value(int id, long value);

    public BigInteger getBigIntegerValue(int id);
    public void setBigIntegerValue(int id, BigInteger value);

    public float getFloat32Value(int id);
    public void setFloat32Value(int id, float value);

    public double getFloat64Value(int id);
    public void setFloat64Value(int id, double value);

    public BigDecimal getBigDecimalValue(int id);
    public void setBigDecimalValue(int id, BigDecimal value);

    public char getCharValue(int id);
    public void setCharValue(int id, char value);

    public byte getByteValue(int id);
    public void setByteValue(int id, byte value);

    public boolean getBooleanValue(int id);
    public void setBooleanValue(int id, boolean value);

    public String getStringValue(int id);
    public void setStringValue(int id, CharSequence value);

    public DynamicData getComplexValue(DynamicData value, int id);
    public void setComplexValue(int id, DynamicData value);


    public int getInt32Values(
            int[] value, int offset, int length, int id);
    public void setInt32Values(
            int id, int[] value, int offset, int length);
    public void setInt32Values(int id, int... value);

    public int getInt16Values(
            short[] value, int offset, int length, int id);
    public void setInt16Values(
            int id, short[] value, int offset, int length);
    public void setInt16Values(int id, short... value);

    public int getInt64Values(
            long[] value, int offset, int length, int id);
    public void setInt64Values(
            int id, long[] value, int offset, int length);
    public void setInt64Values(int id, long... value);

    public int getBigIntegerValues(
            BigInteger[] value, int offset, int length, int id);
    public List<BigInteger> getBigIntegerValues(
            List<BigInteger> value, int id);
    public void setBigIntegerValues(
            int id, BigInteger[] value, int offset, int length);
    public void setBigIntegerValues(int id, List<BigInteger> value);

    public int getFloat32Values(
            float[] value, int offset, int length, int id);
    public void setFloat32Values(
            int id, float[] value, int offset, int length);
    public void setFloat32Values(int id, float... value);

    public int getFloat64Values(
            double[] value, int offset, int length, int id);
    public void setFloat64Values(
            int id, double[] value, int offset, int length);
    public void setFloat64Values(int id, double... value);

    public int getBigDecimalValues(
            BigDecimal[] value, int offset, int length, int id);
    public List<BigDecimal> getBigDecimalValues(
            List<BigDecimal> value, int id);
    public void setBigDecimalValues(
            int id, BigDecimal[] value, int offset, int length);
    public void setBigDecimalValues(int id, List<BigDecimal> value);

    public int getCharValues(
            char[] value, int offset, int length, int id);
    public StringBuilder getCharValues(StringBuilder value, int id);
    public void setCharValues(
            int id, char[] value, int offset, int length);
    public void setCharValues(int id, char... value);
    public void setCharValues(int id, CharSequence value);

    public int getByteValues(
            byte[] value, int offset, int length, int id);
    public void setByteValues(
            int id, byte[] value, int offset, int length);

    public int getBooleanValues(
            boolean[] value, int offset, int length, int id);
    public void getBooleanValues(List<Boolean> value, int id);
    public void setBooleanValues(
            int id, boolean[] value, int offset, int length);
    public void setBooleanValues(int id, boolean... value);

    public int getStringValues(
            String[] value, int offset, int length, int id);
    public void getStringValues(List<String> value, int id);
    public void setStringValues(
            int id, String[] value, int offset, int length);
    public void setStringValues(int id, String... value);
    public void setStringValues(int id, List<String> value);


    public DynamicData clone();
}