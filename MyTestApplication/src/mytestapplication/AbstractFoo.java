/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import static com.sun.java.accessibility.util.EventID.ITEM;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author Vi Incorporated
 */
public class AbstractFoo {

    
                        private int x, y; 
                            private enum State { NEW, INITIALIZING, INITIALIZED };
                            private final AtomicReference<State> init = new AtomicReference<State>(State.NEW);
                            public AbstractFoo(int x, int y) { initialize(x, y); }
                            // This constructor and the following method allow
                            // subclass's readObject method to initialize our state.
                            protected AbstractFoo() { }
                            protected final void initialize(int x, int y) {
                                        if (!init.compareAndSet(State.NEW, State.INITIALIZING))
                                        throw new IllegalStateException(
                                        "Already initialized");
                                        this.setX(x);
                                        this.setY(y);

                                        init.set(State.INITIALIZED);
                            }
                            // These methods provide access to internal state so it can
                            // be manually serialized by subclass's writeObject method.
                            protected final int getX() { checkInit(); return x; }
                            protected final int getY() { checkInit(); return y; }
                            // Must call from all public and protected instance methods
                            private void checkInit() {
                            if (init.get() != State.INITIALIZED) throw new IllegalStateException("Uninitialized");
                            }
    
                            
                            public void setX(int x) {
                                                        this.x = x;
                                                    }

 
                            public void setY(int y) {
                                                        this.y = y;
                                                    }
        
}
