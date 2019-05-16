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
public class JugadorHuma implements Jugador{
  
        private int nJugador;
    private String color;
    private Rajola r;
    private Posicio p;
    private Regio re;
    private int punts;
    private int nSeguidors;
    
    
JugadorHuma (String c, int n){
    assignarColor(c);
    numJugador(n); 
}

    @Override
    public Posicio colocarRajola() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Posicio posicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Regio colocarSeguidor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String llegirRegio() {
         Scanner sc = new Scanner(System.in);
        String reg = sc.next();
        if (reg != "N")
        re.tipusRegio(reg);
        return reg;
    }

    @Override
    public void sumarPunts(int x) {
        punts+=x;
    }

    @Override
    public void sumarSeguidor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        System.out.println("Soc el jugador HUMA num " + nJugador + " amb color " + color);
    }

    
}
