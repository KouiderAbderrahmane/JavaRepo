/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import javafx.scene.paint.RadialGradient;


/**
 *
 * @author Vi Incorporated
 */
public class RandomGenerator {
    private final int min;
    private final int max;
    
    
    public RandomGenerator (int x,int y)
    {
        this.min=x;
        this.max=y;
    }
    public static RandomGenerator  ReturnBetween(int x,int y)
    {
        return new RandomGenerator(x,y);
    }
    
    public static RandomGenerator ReturnMin(int x)
    {
        return new RandomGenerator(x,Integer.MAX_VALUE);
    }
    
    public static RandomGenerator ReturnMax(int y)
    {
        return new RandomGenerator(Integer.MIN_VALUE,y);
    }
    
    public int getmin()
    {
        if (this.min>this.max) return this.max;
                else return this.min;
    }
    public int getmax()
    {
        if (this.min<this.max) return this.max;
                else return this.min;
    }
    
    
    
}