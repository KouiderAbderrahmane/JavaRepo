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
public class Piano extends InstrumentMusique {
    
     public Piano(IAccorder accordage)
        {
            this._accordage = accordage;
        }
    
    @Override
    public void Apparaitre() {
          System.out.println("je suis un Piano");
    }
    
    
}
