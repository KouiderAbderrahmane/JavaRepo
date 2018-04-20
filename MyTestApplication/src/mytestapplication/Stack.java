/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 *
 * @author Vi Incorporated
 */
public class Stack {
    
                    private Object[] elements;
                    private int size = 0;
                    private static final int DEFAULT_INITIAL_CAPACITY = 16;
                    public Stack() {
                    elements = new Object[DEFAULT_INITIAL_CAPACITY];
                    }
                    public void push(Object e) {
                    ensureCapacity();
                    elements[size++] = e;
                    }
                    public Object pop() 
                    {
                                   if (size == 0)
                                        throw new EmptyStackException();
                                        Object result = elements[--size];
                                        elements[size] = null; // Eliminate obsolete reference
                                        return result;
                    }
                    /**
                    * Ensure space for at least one more element, roughly
                    * doubling the capacity each time the array needs to grow.
                    */
                    private void ensureCapacity() {
                    if (elements.length == size)
                    elements = Arrays.copyOf(elements, 2 * size + 1);
                    }
                    
                    @Override public Stack clone() {
                            try {
                            Stack result = (Stack) super.clone();
                            result.elements = elements.clone();
                            return result;
                            } catch (CloneNotSupportedException e) {
                            throw new AssertionError();
                            }
                            }
    
}
