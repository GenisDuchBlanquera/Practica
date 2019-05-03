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

//Pre:--
//Post:Jugador ha triat a quina posició posar la rajola.
@Override
public Posicio triarPosicioRajola(){
    System.out.println("Tria la posicio (x,y) on vols posar la rajola:");
    posicio().llegirPosicio();
    return posicio();
}
//Pre:--
//Post:Tria a quina regió posarà el seu seguidor.
@Override
public String triarRegio(){
    System.out.println("Tria la regio on vols posar el seguidor, sino escriu N");
    return llegirRegio();
}
@Override
public Boolean GirarRajola(){
    System.out.println("Vols girar la rajola? S/N");
    Scanner sc = new Scanner(System.in);
    String resposta = sc.next();
    return resposta == "S";
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
