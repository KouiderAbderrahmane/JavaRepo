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
                            public final class CaseInsensitiveString {
                                private final String s;
                                    public CaseInsensitiveString(String s) {
                                        if (s == null)
                                        throw new NullPointerException();
                                        this.s = s;
                                    }
                                    // Broken - violates symmetry!
                                   /* @Override public boolean equals(Object o) {
                                        if (o instanceof CaseInsensitiveString)
                                            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
                                        if (o instanceof String) // One-way interoperability!
                                            return s.equalsIgnoreCase((String) o);
                                        return false;
                                    }*/
                                    
                                    @Override public boolean equals(Object o) {
                                        return o instanceof CaseInsensitiveString && ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
                                        }
                            //... // Remainder omitted
                            }
