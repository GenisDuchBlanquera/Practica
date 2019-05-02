/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;
import java.util.LinkedList;
import java.util.Random;


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
    
        
}
