/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.awt.Color;

/**
 *
 * @author Vi Incorporated
 */
public class ColorPoint extends Point{
          
                    private final Color color;
                    
                    
                    public ColorPoint(int x, int y, Color color) {
                        super(x, y);
                        this.color = color;
                    }
                    
                        @Override public boolean equals(Object o) {
                                if (!(o instanceof ColorPoint))return false;
                                if (!(o instanceof ColorPoint)) return o.equals(this);
                                return super.equals(o) && ((ColorPoint) o).color == color;
                                }
                        
                   /* @Override   private int Somme()
                        {
                            return super.Somme();
                        }    */
                        @Override   public int Somme()
                        {
                            return super.Somme()+5;
                        } 
                        
}
