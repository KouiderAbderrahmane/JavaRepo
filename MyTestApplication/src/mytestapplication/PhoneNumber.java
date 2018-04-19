/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

/**
 *
 * @author Vi Incorporated
 */
public class PhoneNumber {
                                private volatile int hashCode;
                                private final short areaCode;
                                private final short prefix;
                                private final short lineNumber;
                                public PhoneNumber(int areaCode, int prefix,int lineNumber) {
                                        rangeCheck(areaCode, 999, "area code");
                                        rangeCheck(prefix, 999, "prefix");
                                        rangeCheck(lineNumber, 9999, "line number");
                                        this.areaCode = (short) areaCode;
                                        this.prefix = (short) prefix;
                                        this.lineNumber = (short) lineNumber;
                                }
                                private static void rangeCheck(int arg, int max, String name) {
                                        if (arg < 0 || arg > max)
                                        throw new IllegalArgumentException(name +": " + arg);
                                }
                                @Override public boolean equals(Object o) {
                                            if (o == this)return true;
                                            if (!(o instanceof PhoneNumber))return false;
                                            PhoneNumber pn = (PhoneNumber)o;
                                            return pn.lineNumber == lineNumber && pn.prefix == prefix&& pn.areaCode == areaCode;
                                }
                              /*  
                                @Override public int hashCode() {
                                    int result = 17;
                                    result = 31 * result + areaCode;
                                    result = 31 * result + prefix;
                                    result = 31 * result + lineNumber;
                                    return result;
                                    }*/
                                
                                
                                @Override public int hashCode() {
                                        int result = hashCode;
                                        if (result == 0) {
                                        result = 17;
                                        result = 31 * result + areaCode;
                                        result = 31 * result + prefix;
                                        result = 31 * result + lineNumber;
                                        hashCode = result;
                                        }
                                        return result;
                                        } 
                                
                                
                                @Override public String toString()
                                {
                                    return "lineNumber is"+this.lineNumber+"Area Code is"+this.areaCode+"Prefix is"+this.prefix;
                                    //return null;
                                }
}
