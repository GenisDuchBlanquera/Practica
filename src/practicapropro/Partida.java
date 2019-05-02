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
    PilaRajoles pr;
    Rajola rajola;
    ArrayList<JugadorHuma> llistaJugadorsHuma = new ArrayList<JugadorHuma>();
    ArrayList<JugadorCPU> jugadorsCpu = new ArrayList<JugadorCPU>();
    ArrayList<Integer> posicioCPU = new ArrayList<Integer>();
    Tauler t;

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
        int p = s.nextInt();
        posicioCPU.add(p);
        p = s.nextInt();
        posicioCPU.add(p);
        p = s.nextInt();
        posicioCPU.add(p);
        System.out.println("JugadorsCPU " + posicioCPU.get(0) + " " + posicioCPU.get(1) + " " + posicioCPU.get(2));
        //llegir paraula rajoles
        s.next();
        while (s.hasNext()) {
            String tipus = s.next();
            Rajola j = new Rajola(tipus);
            int n = s.nextInt();
            System.out.println(tipus + " " + n);
            int aux = 0;
            while (aux < n) {

                pr.afegir(j);
                aux++;

            }

        }
        System.out.println(pr.mida());

    }

    void passarTorn() {

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
        while (!t.comp(p)) {
            p = llistaJugadorsHuma.get(tornJugador).triarPosicioRajola();
            while (girar) {
                if (llistaJugadorsHuma.get(tornJugador).girarRajola()) {
                    rajola.girar();
                } else {
                    girar = false;
                }
            }
        }
        
        t.afegirRajola(rajola,p);
        
        if (llistaJugadorsHuma.get(tornJugador).triarRegio() != "N"){
            System.out.println("Tria a quina posicio vols posar el seguidor");
            p.llegirPosicio();
            rajola.afegirSeguidor(p.getX(),p.getY());
        }
        
    }
}
