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
     
      //static mehod factory
        System.out.println(RandomGenerator.ReturnBetween(5,0).getmin());
        System.out.println(RandomGenerator.ReturnMin(5).getmax());
        System.out.println(RandomGenerator.ReturnMax(5).getmin());
        
        
             //Builder 
       NutritionFacts Coca = new NutritionFacts.Builder(2,30).calories(20).sodium(12).carbohydrate(55).build();
       NutritionFacts Coca1 = new NutritionFacts.Builder(0,0).calories(0).sodium(0).build();
       NutritionFacts Coca2 = new NutritionFacts.Builder(0,0).calories(0).build();
       NutritionFacts Coca3 = new NutritionFacts.Builder(0,0).build(); 
        System.out.println("ServingZize est :"+Coca.GetServingSize()); 
        System.out.println("Serving est :"+Coca.GetServings());
      
           //ingleton
        ELVIS.getInstance().GetX();
        System.out.println(ELVIS.getInstance().GetX());
           //private constructor 
       // UtilityClass U = new UtilityClass();
       

       
       
       
    
      
    }
    
}
