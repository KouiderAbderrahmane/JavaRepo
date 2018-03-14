/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import static mytestapplication.RandomGenerator.ReturnBetween;

/**
 *
 * @author Vi Incorporated
 */
public class MyTestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
      
        System.out.println(RandomGenerator.ReturnBetween(5,0).getmin());
        System.out.println(RandomGenerator.ReturnMin(5).getmax());
        System.out.println(RandomGenerator.ReturnMax(5).getmin());
      
    }
    
}
