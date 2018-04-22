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
                            private String prénom, nom;
                      
                        
                        
                        public nom(String prénom, String nom) {
                        if (prénom==null || nom==null)
                        throw new NullPointerException();
                        this.prénom = prénom;
                        this.nom = nom;
                       
                        }
                        
                          @Override public boolean equals(Object o) {
                                            if (o == this)return true;
                                            if (!(o instanceof nom))return false;
                                            nom Nom = (nom)o;
                                            return Nom.nom == this.nom && Nom.prénom == this.prénom;
                                } 
                        
                      public int HashCode ()
                      {
                                        return 31*prénom.hashCode() + nom.hashCode();
                      }
                      @Override public String toString()
                                {
                                    return "le Nom est :"+this.nom+" Le prénom est : "+this.prénom ;
                                 
                                }
                        @Override
                        public int compareTo(Object o) {
                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                        
                        
                       public String GetNom() {return this.nom;}
                       public String GetPrénom() {return this.prénom;}
                       public void SetNom(String nom)
                       {
                           this.nom=nom;
                       }
                       
                       public void SetPrénom(String prenom)
                       {
                           this.prénom=prenom;
                       }
                        

    
}
