/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;

/**
 *
 * @author adriafusterabassedas
 */
public class Regio {
    private String tipus;
    private Boolean seguidor;
    private int n;
    private Boolean bonificacio;
    
    Regio () {
        tipus = " ";
        seguidor = false;
        bonificacio=false;
        n=1;
    }
    public void afegirSeguidor (){
        seguidor = true;
    }
    public void tipusRegio (String s){
        tipus = s;
        n=1;
    }
    
    public String obttipus(){

        return tipus;
    }
    
    public void dividir_cela_regio(){
        tipus="FV";
        n=2;
    }
    public void restar(){
        
        n = n-1;
    }
    
    int vist(){
        
        return n;
    }
    
    
    public boolean comparar_Regio(Regio r){
        
        boolean p=false;
        String aux=r.tipus;
        if((tipus.equals(r.obttipus())) || (tipus.equals("F") && aux.equals("FV")) || (tipus.equals("V") && aux.equals("FV")))
            p=true;
      
        return p;    
    }
    
    public void posar_bonificacio(){
        
        bonificacio=true;
    }
    
    void igualar(Regio r){
        
        n = r.vist();
        tipus = r.obttipus();
        seguidor = r.seguidor();
    }
    
    boolean seguidor(){
        
        return seguidor;
    }
    
    
    

}