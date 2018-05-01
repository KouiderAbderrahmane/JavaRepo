/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Vi Incorporated
 */
                public class InstrumentedHashSet<E> extends HashSet<E> {
                         private int addCount = 0;
                
                public InstrumentedHashSet() {
                        }
                
                    public InstrumentedHashSet(int initCap, float loadFactor) {
                    super(initCap, loadFactor);
                        
                    }
                @Override public boolean add(E e) {
                        addCount++;
                        return super.add(e);
                }
                @Override public boolean addAll(Collection<? extends E> c) {
                addCount += c.size();
                return super.addAll(c);
                }
                public int getAddCount() {
                return addCount;
                }
                }