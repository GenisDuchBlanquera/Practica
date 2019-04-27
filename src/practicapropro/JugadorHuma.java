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
public class JugadorHuma extends Jugador{
  
//Pre:--
//Post:Jugador ha triat a quina posició posar la rajola.
void triarPosicioRajola(){
    System.out.println("Tria la posicio (x,y) on vols posar la rajola:");
    posicio().llegirPosicio();
}
//Pre:--
//Post:Tria a quina regió posarà el seu seguidor.
void triarRegio(){
    System.out.println("Tria la regio on vols posar el seguidor, sino escriu");
    regio().llegirRegio();
}

    
}
