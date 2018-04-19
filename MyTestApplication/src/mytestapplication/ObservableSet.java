/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Vi Incorporated
 */
            public class ObservableSet<E> extends ForwardingSet<E> {
            public ObservableSet(Set<E> set) { super(set); }
            private final List<SetObserver<E>> observers =
            new ArrayList<SetObserver<E>>();
            public void addObserver(SetObserver<E> observer) {
            synchronized(observers) {
            observers.add(observer);
            }
            }
            public boolean removeObserver(SetObserver<E> observer) {
            synchronized(observers) {
            return observers.remove(observer);
            }
            }
            private void notifyElementAdded(E element) {
                List<SetObserver<E>> snapshot = null;
            synchronized(observers) {snapshot = new ArrayList<SetObserver<E>>(observers);}
            for (SetObserver<E> observer : snapshot)
            observer.added(this, element);
            
            }
            public boolean add(E element) {
            boolean added = super.add(element);
            if (added)
            notifyElementAdded(element);
            return added;
            }
            @Override public boolean addAll(Collection<? extends E> c) {
            boolean result = false;
            for (E element : c)
            result |= add(element); // calls notifyElementAdded
            return result;
            }
            }
