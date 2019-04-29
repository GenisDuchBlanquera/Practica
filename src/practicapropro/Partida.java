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
    
    void iniciarPartida (){
        
        System.out.println("Benvingut al joc del Carcassone");
        Scanner sc = new Scanner(System.in);
        numJugadors = sc.nextInt();
        
        
        File f = new File("hola.txt");
        PilaRajoles pr;
        
        try{
        Scanner s = new Scanner(f);
         pr = new PilaRajoles();
            
            s.nextLine();
            s.nextLine();
            s.nextLine();
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
        catch(FileNotFoundException ex){
           
            
        }
      
      
        

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
