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
    private String tipus; /*!< String que distingeix els tipus de regions que hi ha  */
    private Boolean seguidor; /*!< Bolea que significa si una regio te un seguidor o no  */
    private int n; /*!< Enter que serveix per consultar les vegades que s'ha visitat una regio per crear els territoris */
    private Boolean bonificacio; /*!< Bolea que significa si una regio te bonificacio (escut) */

    /** @pre: --
        @post: Constructor de regio amb n=1, booleans a false i tipus buida
    */
    
    Regio () {
        tipus = " ";
        seguidor = false;
        bonificacio=false;
        n=1;
    }
    /** @pre: --
        @post: Canvia el valor del bolea seguidor a true
    */    
    public void afegirSeguidor (){
        seguidor = true;
    }
    /** @pre: --
        @post: Canvia el tipus de regio pel que es passa per parametre i canvia el valor de la n a 1
    */
    public void tipusRegio (String s){
        tipus = s;
        n=1;
    }
     /** @pre: --
        @post: Retorna string amb el tipus de regio 
    */   
    public String obttipus(){

        return tipus;
    }
     /** @pre: --
        @post: Divideix la regio per una que tingui camp i vila a la mateixa
    */   
    public void dividir_cela_regio(){
        tipus="FV";
        n=2;
    }
    /** @pre: --
        @post: Resta una unitat el valor de la n
    */
    public void restar(){
        
        n = n-1;
    }
    /** @pre: --
        @post: Retorna el valor de l'atribut n
    */
    int vist(){
        
        return n;
    }
    /** @pre: --
        @post: Compara dues regions i retorna cert si son iguals, altrament fals
    */    
    
    public boolean comparar_Regio(Regio r){
        
        boolean p=false;
        String aux=r.tipus;
        if((tipus.equals(r.obttipus())) || (tipus.equals("F") && aux.equals("FV")) || (tipus.equals("V") && aux.equals("FV")))
            p=true;
      
        return p;    
    }
    /** @pre: --
        @post: Canvia el valor del bolea bonificacio a true
    */
    public void posar_bonificacio(){
        
        bonificacio=true;
    }
     /** @pre: --
        @post: Iguala una regio amb el mateix valor a la que es passada per parametre
    */   
    void igualar(Regio r){
        
        n = r.vist();
        tipus = r.obttipus();
        seguidor = r.seguidor();
    }
     /** @pre: --
        @post: Retorna el bolea seguidor
    */   
    boolean seguidor(){
        
        return seguidor;
    }
    
        

}