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
public final class Complex {
    
                    private final double re;//field private and final
                    private final double im;//field private and final
                    
                     ///constructeur 
                        public Complex(double re, double im) {
                        this.re = re;
                        this.im = im;
                        }
                        
                      // static factory method
                        
                        public static Complex FactoryValueOf(double re,double im)
                        {
                             return new Complex(re, im);
                        }
                        
                        //
                        public double realPart() 
                        {
                            return re;
                        }
                        
                        public double imaginaryPart()
                        {
                            return im;
                        }
                        // les méthodes arithmétiques retournent un autre objet Complex au lien de modifier l'instance 
                        public Complex add(Complex c) 
                        { 
                            return new Complex(re + c.re, im + c.im);
                        }
                        
                        public Complex subtract(Complex c) 
                        {
                            return new Complex(re - c.re, im - c.im);
                        }
                        
                        public Complex multiply(Complex c)
                        {
                             return new Complex(re * c.re - im * c.im,re * c.im + im * c.re);
                        }
                        
                        public Complex divide(Complex c) 
                        {
                            double tmp = c.re * c.re + c.im * c.im;
                            return new Complex((re * c.re + im * c.im) / tmp,(im * c.re - re * c.im) / tmp);
                        }
                        
                        @Override public boolean equals(Object o) {   
                            if (o == this) return true;
                            if (!(o instanceof Complex))  return false;
                            Complex c = (Complex) o;
                            return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
                            }                          
                        
                        
                        @Override public int hashCode() 
                        {
                            int result = 17 + hashDouble(re);
                            result = 31 * result + hashDouble(im);
                            return result;
                        }
                        
                        
                        private int hashDouble(double val) 
                        {
                            long longBits = Double.doubleToLongBits(re);
                            return (int) (longBits ^ (longBits >>> 32));
                        }
                        
                        
                        @Override public String toString()
                        {
                            return "(" + re + " + " + im + "i)";
                        }
                    }