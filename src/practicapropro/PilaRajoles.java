/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;
import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;


/**
 *
 * @author adriafusterabassedas
 */
public class PilaRajoles {
    
    
    private final LinkedList<Rajola> cua;

    
    public PilaRajoles() {
        cua= new LinkedList<>();
       
        
    }
    
    public void afegir (Rajola r){
        
        this.cua.add(r);
    }
    
    public int mida(){
        
        return cua.size();
    }
    
    
    public Rajola agafarRajola(){
        
        Rajola j=new Rajola();
        
        Random r = new Random();
        int valor = r.nextInt(mida());
        
        j= cua.get(valor);
        cua.remove(valor);
        
        return j;
        
    }
    
      public Rajola primeraRajola(String t){
        
        Rajola r = new Rajola();
    
        Iterator<Rajola> it= cua.iterator();
        
        int pos=-1;
        boolean trobada=false;
    
        while(it.hasNext()&& !trobada){
          
              r=it.next();
              pos++;
              if(r.obtTipus().equals(t)){
                  trobada=true;
                 
              }

        }
        System.out.println("POSICIIOO "+ pos);
        cua.remove(pos);
        return r;
       
    }
    
    
    
      public void mostrarrajoles(){
        Rajola r = new Rajola();
    
        Iterator<Rajola> it= cua.iterator();
      
        
        while(it.hasNext()){
            r=it.next();
            System.out.println(r.obtTipus());
            
            
        }
        
    
    }
        
}
