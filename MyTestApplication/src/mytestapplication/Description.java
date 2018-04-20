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
public class Description implements Cloneable{
        private String desc;
        
        public Description (String desc)
        {
            this.desc=desc;
        }
        
        
         @Override public boolean equals(Object o) {
                                            if (o == this)return true;
                                            if (!(o instanceof Description))return false;
                                            Description pn = (Description)o;
                                            return pn.getDesc() == getDesc();
                                }

        
        @Override public Description clone()
        {
            try {
                
                                  Description D= (Description) super.clone();
                                  return D;
                                   //return  (Description)super.clone();
                                   
                                    
                                    } catch(CloneNotSupportedException e) {
                                    throw new AssertionError();
                                    }
                                    
        }

                                    /**
                                     * @return the desc
                                     */
                                    public String getDesc() {
                                        return desc;
                                    }

                                    /**
                                     * @param desc the desc to set
                                     */
                                    public void setDesc(String desc) {
                                        this.desc = desc;
                                    }

    
}
