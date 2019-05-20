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

    int numJugadors; /*!< Enter que indica en nombre de jugadors que jugaran a la partida */
    int tornJugador; /*!< Enter que indica el nombre de torn que s'esta jugant */
    PilaRajoles pr; /*!< Delclaracio d'una pila de rajoles d'on s'aniran agafant per jugar la partida  */
    Rajola rajola; /*!< Declaracio d'un rajola  */
    Rajola primera_rajola; /*!< Declaracio de la primra rajola  */
    ArrayList<JugadorHuma> llistaJugadorsHuma = new ArrayList<JugadorHuma>(); /*!< Arraylist on s'hi guardara els jugadors que seran humans */
    ArrayList<JugadorCPU> jugadorsCpu = new ArrayList<JugadorCPU>(); /*!< Arraylist on s'hi guardara els jugadors que seran cpu */
    ArrayList<Integer> posicioCPU = new ArrayList<Integer>(); /*!< Arraylist on s'hi guardara la poscio dels jugadors que seran cpu */
    Tauler t; /*!< Declaracio d'un taulell per jugar */
    boolean camperols; /*!< Bolea que indicara si a la partida hi ha camperols o no */
    
    /** @pre: --
        @post: Constructor que inicia la partida llegint de fitxer la quantitar de jugadors, quins son humans i quins cpu, 
        * quines rajoles hi haurà i en quina quantitat i guarda la rajola inicial de la partida
    */ 
    void iniciarPartida() throws FileNotFoundException {

        System.out.println("Benvingut al joc del Carcassone");

        File f = new File("prova1.txt");

        Scanner s = new Scanner(f);
        pr = new PilaRajoles();
        //llegir nombre_jugadors
        s.next();
        numJugadors = s.nextInt();
        System.out.println("Nombre jugadors " + numJugadors);
        //llegir jugadors cpu
        s.next();
        
        while(s.hasNextInt()){
            int p = s.nextInt();
            posicioCPU.add(p);
        }
        
        System.out.println("JugadorsCPU " + posicioCPU.get(0) + " " + posicioCPU.get(1) + " " + posicioCPU.get(2));
        //llegir paraula rajoles
        s.next();
        
       boolean acabarrajoles=false;
        while (s.hasNext() && !acabarrajoles) {
            String tipus = s.next();
            if(tipus.equals("#"))
                acabarrajoles=true;
            
            else{
                Rajola j = new Rajola(tipus);
                int n = s.nextInt();
                System.out.println(tipus + " " + n);
                int aux = 0;
                while (aux < n) {

                    pr.afegir(j);
                    aux++;

                }
            }
        }
        System.out.println("Mida cua rajoles "+ pr.mida());
        s.next();
        String primerafitxa=s.next();
      

        Rajola raj=pr.primeraRajola(primerafitxa);       
        Rajola primera=new Rajola();
        primera.copia(raj);
        System.out.println("Primeraaaaa fitxa "+ primera.tipus());
        
        //pr.mostrarrajoles();
         
        
        s.next();
        
        
        String cam=s.next();
        if(cam.equals("sí"))
            camperols=true;
        else
            camperols=false;
        
        System.out.println("Camperols "+ camperols);

    }

    void passarTorn() {
        tornJugador++;
    }
    
    void sumarPuntsCamps() {

    }

    void retornarSeguidors(Regio r) {

    }

    private void actualitzarTauler() {

    }

    private void sumarPuntsCiutat() {

    }

    private void sumarPuntsMonestir() {

    }
    public void jugar(){
        
    }
    void tornJugadorHuma() {
        Posicio p = new Posicio();
        Boolean girar = true;
        p = llistaJugadorsHuma.get(tornJugador).triarPosicioRajola();
        while (girar) {
            if (llistaJugadorsHuma.get(tornJugador).girarRajola()) {
                rajola.girar();
            } else {
                girar = false;
            }
        }
        while (true/*!t.comp(p)*/) {
            p = llistaJugadorsHuma.get(tornJugador).triarPosicioRajola();
            while (girar) {
                if (llistaJugadorsHuma.get(tornJugador).girarRajola()) {
                    rajola.girar();
                } else {
                    girar = false;
                }
            }
        }
        
        //t.afegirRajola(rajola,p);
        
        /*if (!llistaJugadorsHuma.get(tornJugador).triarRegio().equals("N")){
            System.out.println("Tria a quina posicio vols posar el seguidor");
            p.llegirPosicio();
            rajola.afegirSeguidor(p.getX(),p.getY());
        }*/
        
    }
}
