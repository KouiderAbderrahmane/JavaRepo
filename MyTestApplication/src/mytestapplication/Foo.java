/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Vi Incorporated
 */
            public class Foo extends AbstractFoo implements Serializable {
            private void readObject(ObjectInputStream s)
            throws IOException, ClassNotFoundException {
            s.defaultReadObject();
            // Manually deserialize and initialize superclass state
            int x = s.readInt();
            int y = s.readInt();
            initialize(x, y);
           // }294 CHAPTER 11 SERIALIZATION
           /* private void writeObject(ObjectOutputStream s) throws IOException {
            s.defaultWriteObject();
            // Manually serialize superclass state
            s.writeInt(getX());
            s.writeInt(getY());
            }
            // Constructor does not use the fancy mechanism
            public Foo(int x, int y) { super(x, y); }
            private static final long serialVersionUID = 1856835860954L;*/
            }}