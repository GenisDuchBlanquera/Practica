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
public class JugadorCPU implements Jugador {

    private int nJugador;
    private String color;
    private Rajola r;
    private Posicio p;
    private Regio re;
    private int punts;
    private int nSeguidors;

    JugadorCPU(String c, int n) {
        assignarColor(c);
        numJugador(n);
    }

    
    
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

    @Override
    public Posicio triarPosicioRajola() {
        
    }

    @Override
    public String triarRegio() {
       
    }

    @Override
    public Boolean GirarRajola() {
        
    }
}
