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
public class Jugador {
    
    private int nJugador;
    private String color;
    private Rajola r;
    private Posicio p;
    private Regio re;
    private int punts;
    private int nSeguidors;
    
    Jugador (){
        color = "";
        punts = 0;
        nSeguidors = 0;
    }
    //Pre:Rajola existent
//Post:Col·locarà la rajola que vol colocar al taulell
    Posicio colocarRajola(){
            return p;
    }
    Posicio posicio(){
            return p;
    }
//Pre:Seguidor existent
//Post:Col·locarà el seguidor que vol colocar al taulell.
    Regio colocarSeguidor(){
        return re;
    }
    Regio regio(){
        return re;
    }
//Pre:--
//Post:Suma x a la puntuació del jugador.
    void sumarPunts(int x){
        punts+=x;
    }
//Pre:--
//Post:Afegeix el seguidor a la llista de seguidors.
    void sumarSeguidor(){
        nSeguidors++;
    }
    
    void assignarColor (String s){
        color = s;
    }

}
