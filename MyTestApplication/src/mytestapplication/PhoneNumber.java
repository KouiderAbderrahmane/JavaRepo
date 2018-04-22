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
public class PhoneNumber implements Cloneable{
                                private volatile int hashCode;
                                private Description descr;
                                private short areaCode;
                                private short prefix;
                                private short lineNumber;
                                
                                
                                public PhoneNumber( int areaCode, int prefix,int lineNumber) {
                                      
                                        
                                        this.areaCode = (short) areaCode;
                                        this.prefix = (short) prefix;
                                        this.lineNumber = (short) lineNumber;
                                }
                                
                                public PhoneNumber(Description desc, int areaCode, int prefix,int lineNumber) {
                                        /*rangeCheck(descr, 999, "Description");
                                        rangeCheck(areaCode, 999, "area code");
                                        rangeCheck(prefix, 999, "prefix");
                                        rangeCheck(lineNumber, 9999, "line number");*/
                                        this.descr=(Description)desc;
                                        this.areaCode = (short) areaCode;
                                        this.prefix = (short) prefix;
                                        this.lineNumber = (short) lineNumber;
                                }
                                private static void rangeCheck(int arg, int max, String name) {
                                        if (arg < 0 || arg > max)
                                        throw new IllegalArgumentException(name +": " + arg);
                                }
                                private void rangeCheck(Description descr, int i, String description) {
                                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                                }

                                
                                @Override public boolean equals(Object o) {
                                            if (o == this)return true;
                                            if (!(o instanceof PhoneNumber))return false;
                                            PhoneNumber pn = (PhoneNumber)o;
                                            return pn.getLineNumber() == getLineNumber() && pn.getPrefix() == getPrefix()&& pn.getAreaCode() == getAreaCode();
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
                                        result = 31 * result + getAreaCode();
                                        result = 31 * result + getPrefix();
                                        result = 31 * result + getLineNumber();
                                        hashCode = result;
                                        }
                                        return result;
                                        } 
                                
                                
                                @Override public String toString()
                                {
                                    return "lineNumber is"+this.getLineNumber()+"Area Code is"+this.getAreaCode()+"Prefix is"+this.getPrefix();
                                    //return null;
                                }
                                
                                @Override public PhoneNumber clone() {
                                    try {
                                    PhoneNumber phone= (PhoneNumber) super.clone();
                                    //phone.descr= (Description) descr.clone();
                                    return phone;
                                    } catch(CloneNotSupportedException e) {
                                    throw new AssertionError();
                                    }
                                    
                                    }
                                public int CompareTo(PhoneNumber pn)
                                {
                                    if(this.areaCode<pn.areaCode) return -1;
                                    if(this.areaCode>pn.areaCode) return 1;
                                    
                                    if(this.lineNumber<pn.lineNumber) return -1;
                                    if(this.lineNumber>pn.lineNumber) return 1;
                                    
                                    if(this.prefix<pn.prefix) return -1;
                                    if(this.prefix>pn.prefix) return 1;
                                    
                                    return 0;
                                }

                              
                                public short getAreaCode() {
                                    return areaCode;
                                }
                                
                                public void setAreaCode(short areaCode) {
                                    this.areaCode = areaCode;
                                }

                              
                                public short getPrefix() {
                                    return prefix;
                                }

                               
                                public void setPrefix(short prefix) {
                                    this.prefix = prefix;
                                }

                               
                                public short getLineNumber() {
                                    return lineNumber;
                                }

                                public void setLineNumber(short lineNumber) {
                                    this.lineNumber = lineNumber;
                                }

                                  
                                    public Description getDescr() {
                                        return descr;
                                    }

                                    
                                    public void setDescr(Description descr) {
                                        this.descr = descr;
                                    }

}  
