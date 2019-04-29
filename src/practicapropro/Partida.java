/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author genis
 */
public class Partida {
    int numJugadors;
    int tornJugador;
    ArrayList<Jugador> llistaJugadors = new ArrayList<Jugador>();
    ArrayList<Integer> jugadorsCpu = new ArrayList<Integer>();
    
    void iniciarPartida () throws FileNotFoundException{
        
        System.out.println("Benvingut al joc del Carcassone");
       
        File f = new File("prova1.txt");
        PilaRajoles pr;
        
        Scanner s = new Scanner(f);
        pr = new PilaRajoles();
        //llegir nombre_jugadors
        s.next();
        numJugadors = s.nextInt();
        System.out.println("Nombre jugadors " + numJugadors);
        //llegir jugadors cpu
        s.next();
        int p=s.nextInt();
        jugadorsCpu.add(p);
        p=s.nextInt();
        jugadorsCpu.add(p);
        p=s.nextInt();
        jugadorsCpu.add(p);
        System.out.println("JugadorsCPU " +jugadorsCpu.get(0)+" "+jugadorsCpu.get(1)+" "+jugadorsCpu.get(2));
        //llegir paraula rajoles
        s.next();
        while(s.hasNext()) {
            String tipus=s.next();
            Rajola j= new Rajola(tipus);
            int n=s.nextInt();
            System.out.println(tipus + " " +n);
            int aux=0;
            while(aux<n){
                
                pr.afegir(j);
                aux++;
                
            }
            
        }
        System.out.println(pr.mida());

    }
    
    void passarTorn() {
    
    }
    
    void sumarPuntsCamps (){
        
    }
    void retornarSeguidors (Regio r){
        
    }
    
    private void actualitzarTauler() {
        
    }
    
    private void sumarPuntsCiutat(){
        
    }
    private void sumarPuntsMonestir(){
        
    }
    
    
}
