/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestapplication;

import java.io.Serializable;

/**
 *
 * @author Vi Incorporated
 */
public class nom implements Comparable,Cloneable,Serializable{
    
                            private volatile int hashCode;
                            private String pr�nom, nom;
                      
                        
                        
                        public nom(String pr�nom, String nom) {
                        if (pr�nom==null || nom==null)
                        throw new NullPointerException();
                        this.pr�nom = pr�nom;
                        this.nom = nom;
                       
                        }
                        
                          @Override public boolean equals(Object o) {
                                            if (o == this)return true;
                                            if (!(o instanceof nom))return false;
                                            nom Nom = (nom)o;
                                            return Nom.nom == this.nom && Nom.pr�nom == this.pr�nom;
                                } 
                        
                      public int HashCode ()
                      {
                                        return 31*pr�nom.hashCode() + nom.hashCode();
                      }
                      @Override public String toString()
                                {
                                    return "le Nom est :"+this.nom+" Le pr�nom est : "+this.pr�nom ;
                                 
                                }
                        @Override
                        public int compareTo(Object o) {
                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                        
                        
                       public String GetNom() {return this.nom;}
                       public String GetPr�nom() {return this.pr�nom;}
                       public void SetNom(String nom)
                       {
                           this.nom=nom;
                       }
                       
                       public void SetPr�nom(String prenom)
                       {
                           this.pr�nom=prenom;
                       }
                        

    
}
