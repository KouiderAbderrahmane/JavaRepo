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
public class Guitare extends InstrumentMusique {

    public Guitare(IAccorder accordage)
        {
            this._accordage = accordage;
        }
    
    @Override
    public void Apparaitre() {
          System.out.println("je suis un guitare");
    }
    
}
