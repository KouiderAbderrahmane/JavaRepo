/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.awt.Color;
import static java.lang.Math.E;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import static mytestapplication.RandomGenerator.ReturnBetween;

/**
 *
 * @author Vi Incorporated
 */
public class MyTestApplication {
       
    
    
    private static boolean stopRequested;
                    private static synchronized void requestStop() {
                        stopRequested = true;
                        }
                    private static synchronized boolean stopRequested() {
                        return stopRequested;
                        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
     
      //static mehod factory
      /*  System.out.println(RandomGenerator.ReturnBetween(5,0).getmin());
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
        System.out.println(ELVIS.getInstance().GetX());*/
           //private constructor 
       // UtilityClass U = new UtilityClass();
       
                                
                             /*   Thread backgroundThread = new Thread(new Runnable() {
                                public void run() {
                                int i = 0;
                                while (!stopRequested)
                                //i++;  
                                     System.out.println("it's running");
                                if (stopRequested) System.out.println("Oooops its stops"); 
                                }
                                });
                                backgroundThread.start();
                                TimeUnit.SECONDS.sleep(1);
                                stopRequested = true;
                                }*/
                             
                            /* Thread backgroundThread = new Thread(new Runnable() {
                                public void run() {
                                int i = 0;
                                while (!stopRequested())
                                //i++;  
                                     System.out.println("it's running");
                                if (stopRequested) System.out.println("Oooops its stops"); 
                                }

                             
                                });
                                backgroundThread.start();
                                TimeUnit.SECONDS.sleep(1);
                                requestStop();*/
                            
                            
                          /*  ObservableSet<Integer> set =
                                new ObservableSet<Integer>(new HashSet<Integer>());
                            
                            
                                set.addObserver(new SetObserver<Integer>() {
                                public void added(ObservableSet<Integer> s, Integer e) {
                                System.out.println(e);
                                if (e == 23) s.removeObserver(this);
                                }
                                });
                                for (int i = 0; i < 100; i++)
                                set.add(i);
                            /*
                           /* set.addObserver(new SetObserver<Integer>() {
                                public void added(final ObservableSet<Integer> s, Integer e) {
                                System.out.println(e);
                                if (e == 23) {
                                ExecutorService executor = Executors.newSingleThreadExecutor();
                                final SetObserver<Integer> observer = this;
                                try {
                                executor.submit(new Runnable() {
                                public void run() {
                                s.removeObserver(observer);
                                }
                                }).get();
                                } catch (ExecutionException ex) {
                                throw new AssertionError(ex.getCause());
                                } catch (InterruptedException ex) {
                                throw new AssertionError(ex.getCause());
                                } finally {
                                executor.shutdown();
                                }
                                }
                                }
                                });
                            for (int i = 0; i < 100; i++)
                                set.add(i);*/

                                
                                
                                
                               /* CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
                                String s = "polish";
                                s.equals(cis);
                                cis.equals(s);
                                System.out.println(s.equals(cis));*/
                                
                                
                            /*    
                                
                                ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
                                Point p2 = new Point(1, 2);
                                ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
                                
                                 System.out.println(p1.equals(p2));
                                 System.out.println(p2.equals(p3));
                                 System.out.println(p1.equals(p3));
                                 */
                                 
                                 
                                 Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
                                 Description desc=new Description("Desc");
                                  m.put(new PhoneNumber(desc,707, 867, 5309), "Jenny");
                               // m.put(new PhoneNumber(707, 867, 5309), "Jenny");
                               // m.get(new PhoneNumber(707, 867, 5309));
                                //System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
                                //System.out.println(new PhoneNumber(707, 867, 5309).hashCode());
                                
                               // System.out.println(m.toString());
                               PhoneNumber p = new PhoneNumber(desc,707, 867, 5309);
                                System.out.println(p.getDescr().getDesc());
                                PhoneNumber p1=p.clone();
                                System.out.println(p1.getDescr().getDesc());
                                
                                System.out.println(p1.equals(p));
                              
                                
                              //  System.out.println(p.clone() !=p);
                                //System.out.println(p.clone().equals(p));
                                    //System.out.println(p.clone().getClass());
                                      //  System.out.println(p.getClass());
                                
                               /*Description Descrption=new Description("Leon");
                               Product pr=new Product(Descrption,"Seat", 12222222);
                               Product pr2= (Product) pr.clone();
                               System.out.println(pr2);*/
                                      
                                      
                               
                               //////CompareTO
                                System.out.println("CompareTo");
                               nom n = new nom("K", "A");
                               nom n1 = new nom("K", "A");
                               System.out.println(n.equals(n1));
                               System.out.println(n.HashCode());
                               
                               PhoneNumber phone =new PhoneNumber(1220, 1000, 15000);
                               PhoneNumber phone1 =new PhoneNumber(1222, 1000, 15000);
                               
                               System.out.println("this is compareTo :"+phone.CompareTo(phone1));
                               
                               
                               /*
                               InstrumentedHashSet<String> s =
                                new InstrumentedHashSet<String>();
                                s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
                                   System.out.println(s.getAddCount());*/
                               
                               
                               
                          
                                
                                      
                               
                               //////
                               
                               InstrumentMusique guitare=new Guitare(new AccorderAvecDiapason());
                               guitare.Apparaitre();
                               guitare.AccorderInstrument();
                               guitare.Jouer();
                               
                               InstrumentMusique piano = new Piano(new NePasAccorder());
                               piano.Apparaitre();
                               piano.AccorderInstrument();
                               piano.Jouer();
                               
                               
                               piano.SetAccordage(new NePasAccorder());
                               piano.Jouer();
                               
                                
                                }
                         

       
       
       
    
      
    
    
}
