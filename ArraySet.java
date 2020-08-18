/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author asus
 */
public class ArraySet extends ArrayCollection{
    public ArraySet(int c){
           super(c);
    }
    public void add(Object e) {
         if(e == null) throw new IllegalArgumentException();
         if(!super.contains(e)){
           super.add(e);
           }       
       }
    public ArraySet union(ArraySet other){
           Object [] uset = other.toArray();
           for(int i=0;i<other.size();i++){
             this.add(uset[i]);
           }
           return this;
   }
    public ArraySet intersection(ArraySet other){
           Object [] inter_set = other.toArray();        
           ArraySet as = new ArraySet(0);
           for(int i=0;i<other.size();i++){
                      if(this.contains(inter_set[i])){
                                 as.add(inter_set[i]);
                      }
           }
           return as;
   }
     public boolean equals(ArraySet other){
           Object []  set = other.toArray();
           if(this.size() == other.size()){
                      for(int i=0;i<other.size();i++){
                          if(!this.contains(set[i])){
                                 return false;
                                 }                         
                      }         
           }
           return true;
     }
}

