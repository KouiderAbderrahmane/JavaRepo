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
public class ELVIS {
         private String x="this is atrribut";
    
            private static final ELVIS INSTANCE = new ELVIS();

               private ELVIS() {}
               public static ELVIS getInstance() { return INSTANCE; }
                public void leaveTheBuilding() { }
                
                private Object readResolve() {
                            return INSTANCE;
                            }
            
                
               public String GetX()
               {
                   return this.x;
               }   
}
