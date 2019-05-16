/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;

import java.util.ArrayList;

/**
 *
 * @author genis
 */
public class JugadorCPU extends Jugador{
    

    
    @Override
    public Posicio colocarRajola() {
       
    }

    @Override
    public Posicio posicio() {
        
    }

    @Override
    public Regio colocarSeguidor() {
       
    }

    @Override
    public String llegirRegio() {
        
    }

    @Override
    public void sumarPunts(int x) {
        
    }

    @Override
    public void sumarSeguidor() {
       
    }
    
    @Override
    public void assignarColor(String s) {
        color = s;
    }

    @Override
    public void numJugador(int n) {
        nJugador = n;
    }

    @Override
    public void mostrar() {
        System.out.println("Soc el jugador CPU num " + nJugador + " amb color " + color);
    }


    public Posicio triarPosicioRajola(Tauler t) {
        
        int puntsMax = 0;
        Rajola aux = r;
        Posicio auxP = new Posicio();
        ArrayList<Posicio> posicionsPossibles = t.getPosicionsPossibles();
        for (int i = 0; i < posicionsPossibles.size(); i++){
            for (int j = 0; j < 4; j++){
            if (t.esFactible(posicionsPossibles.get(i))){
                if (!t.teSeguidor(posicionsPossibles.get(i))){
                    if(puntsMax == 0 || puntsMax < t.punts(posicionsPossibles.get(i))){
                        puntsMax = t.punts(posicionsPossibles.get(i);
                        aux = r;
                        auxP = posicionsPossibles.get(i);
                    }
                }
                    
            }
           }
        }
        
        return auxP;
    }

    public String triarRegio(Tauler t) {
        int maxPunts = 0;
       for (int i = 0; i < 25 ; i++){
           
       }
    }

    public int GirarRajola(int n) {
        return n;
    }
}
