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
Posicio triarPosicioRajola(){
    System.out.println("Tria la posicio (x,y) on vols posar la rajola:");
    posicio().llegirPosicio();
    return posicio();
}
//Pre:--
//Post:Tria a quina regió posarà el seu seguidor.
String triarRegio(){
    System.out.println("Tria la regio on vols posar el seguidor, sino escriu N");
    return llegirRegio();
}

Boolean girarRajola(){
    System.out.println("Vols girar la rajola? S/N");
    Scanner sc = new Scanner(System.in);
    String resposta = sc.next();
    return resposta == "S";
}

    
}
