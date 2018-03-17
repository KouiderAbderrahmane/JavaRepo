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
          //  public static final Elvis INSTANCE = new Elvis();

               private ELVIS() {}
               public static ELVIS getInstance() { return INSTANCE; }
                public void leaveTheBuilding() { }
            
                
               public String GetX()
               {
                   return this.x;
               }   
}
