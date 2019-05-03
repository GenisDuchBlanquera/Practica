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
    
    Regio () {
        tipus = " ";
        seguidor = false;
    }
    public void afegirSeguidor (){
        seguidor = true;
    }
    public void tipusRegio (String s){
        tipus = s;
    }
    
    public String obttipus(){

        return tipus;
    }
    
    public void dividir_cela_regio(String s){
        tipus=tipus+s;
}
    
    public boolean comparar_Regio(Regio r){
        
        boolean p=false;
        String aux=r.tipus;
        if((tipus.equals(r.obttipus())) || (tipus.equals("F") && aux.equals("VF")) || (tipus.equals("V") && aux.equals("VF")))
            p=true;
      
        return p;    
    }

}