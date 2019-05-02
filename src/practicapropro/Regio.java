/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;

/**
 *
 * @author genis
 */
public class Regio {
    private String tipus;
    private Boolean seguidor;
    
    Regio () {
        tipus = " ";
        seguidor = false;
    }
    void afegirSeguidor (){
        seguidor = true;
    }
    void tipusRegio (String s){
        tipus = s;
    }
    
    String obttipus(){

        return tipus;
    }
    
    void dividir_cela_regio(String s){
        tipus=tipus+s;
}

}