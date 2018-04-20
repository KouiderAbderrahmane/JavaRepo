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
public class Product {
    
    
    private Description Description;
    private String Marque;
    private int Price;
    
    public Product(Description Desc, String Marque, int Price)
    {
        this.Description=Desc;
        this.Marque=Marque;
        this.Price=Price;
    }
    
                    public Object clone() {
                                Object o = null;
                                try {
                                       
                                        
                                        o = super.clone();
                                        
                                } catch(CloneNotSupportedException cnse) {
                                       
                                        cnse.printStackTrace(System.err);
                                }
                               
                                return o;
                        }
    
    
    
}
