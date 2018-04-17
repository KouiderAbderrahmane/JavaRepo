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
public class StopThread {
                    private static boolean stopRequested;

                    private static synchronized void requestStop() {
                        stopRequested = true;
                        }
                    private static synchronized boolean stopRequested() {
                        return stopRequested;
                        }
    
}
