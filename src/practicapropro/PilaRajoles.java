/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;
import java.util.LinkedList;


/**
 *
 * @author adriafusterabassedas
 */
public class PilaRajoles {
    
    
    private final LinkedList cua;

    
    public PilaRajoles() {
        this.cua= new LinkedList();
    }
    
    public void afegir (Object r){
        
        this.cua.add(r);
    }
    
    public Object consultar(){
        
       return this.cua.peek();
    }
    
    public void eliminar(){
        this.cua.remove();
    }
    
    
    public void mostrar(){
        
        for(int i=0;i<cua.size();i++){
            System.out.print(cua.get(i));
        }
        
    }
    
    public int mida(){
        
        return cua.size();
    }
    
       
    
}
