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
    private char tipus;
    private Boolean seguidor;
    
    Regio () {
        tipus = ' ';
        seguidor = false;
    }
    void afegirSeguidor (){
        seguidor = true;
    }
    void tipusRegio (String s){
        tipus = s.charAt(0);
    }
    
    char obttipus(){

        return tipus;
    }
    
}
