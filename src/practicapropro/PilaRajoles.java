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

    /** @pre: --
        @post: Constructor que crea una linkedlist de rajoles buida
    */     
    public PilaRajoles() {
        cua= new LinkedList<>();
   
    }
    /** @pre: --
        @post: Funcio que afegeix una rajola a la linkedlist
    */     
    public void afegir (Rajola r){
        
        this.cua.add(r);
    }
     /** @pre: --
        @post: Retorna un int amb la mida de la linkedlist
    */    
    public int mida(){
        
        return cua.size();
    }
    
     /** @pre: --
        @post: Retorna una rajola a l'atzar, i l'elimina, de la linkedlist 
    */    
    public Rajola agafarRajola(){
        
        Rajola j=new Rajola();
        
        Random r = new Random();
        int valor = r.nextInt(mida());
        
        j= cua.get(valor);
        cua.remove(valor);
        
        return j;
        
    }
     /** @pre: --
        @post: Retorna la primera rajola que es colocara al tauler, aquesta ve donada pel ftixer d'entrada i es la que s'entra per parametre
    */    
      public Rajola primeraRajola(String t){
        
        Rajola r = new Rajola();
    
        Iterator<Rajola> it= cua.iterator();
        
        int pos=-1;
        boolean trobada=false;
    
        while(it.hasNext()&& !trobada){
          
              r=it.next();
              pos++;
              if(r.tipus().equals(t)){
                  trobada=true;
                 
              }

        }
        cua.remove(pos);
        return r;
       
    }
    
    /** @pre: --
        @post: Funicio que mostra totes les rajoles que queden a la linkedlist
    */      
      public void mostrarrajoles(){
        Rajola r = new Rajola();
    
        Iterator<Rajola> it= cua.iterator();
      
        
        while(it.hasNext()){
            r=it.next();
            System.out.println(r.tipus());
            
            
        }
        
    
    }
        
}
