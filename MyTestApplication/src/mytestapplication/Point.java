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
public class Point {
                    private final int x;
                    private final int y;
                        public Point(int x, int y) {
                        this.x = x;
                        this.y = y;
                        }
                        @Override public boolean equals(Object o) {
                                    
                                if (o == null || o.getClass() != getClass())
                                return false;
                                Point p = (Point) o;
                                return p.x == x && p.y == y;
                        }
    
}
