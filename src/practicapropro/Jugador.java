/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;

import java.util.Scanner;

/**
 *
 * @author genis
 */
public interface Jugador {
    

    

    //Pre:Rajola existent
    //Post:Col·locarà la rajola que vol colocar al taulell
    Posicio colocarRajola();

    
    Posicio posicio();

//Pre:Seguidor existent
//Post:Col·locarà el seguidor que vol colocar al taulell.
    Regio colocarSeguidor();

    String llegirRegio();
       
    
//Pre:--
//Post:Suma x a la puntuació del jugador.
    void sumarPunts(int x);
//Pre:--
//Post:Afegeix el seguidor a la llista de seguidors.
    void sumarSeguidor();
    
    void assignarColor (String s);
    void numJugador(int n);
    
    void mostrar();
    
    Posicio triarPosicioRajola();
    String triarRegio();
    Boolean GirarRajola();

}
