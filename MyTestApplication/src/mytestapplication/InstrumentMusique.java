/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.io.Console;

/**
 *
 * @author Vi Incorporated
 */
public  abstract  class InstrumentMusique {
       
       protected IAccorder _accordage;
       
       public void AccorderInstrument()
       {
           this._accordage.Accorder();
       }
           
       public void SetAccordage(IAccorder accordage)
       {
           this._accordage=accordage;
       }
    
        public void Jouer()
        {
            System.out.println("Jouer de l'instrument");
        }

          public abstract void Apparaitre();
    }
    

