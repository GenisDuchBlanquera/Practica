/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapropro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author genis
 */
public class PracticaProPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> llistaJugadorsHuma = new ArrayList<Jugador>();
        ArrayList<String> colors = new ArrayList<String>();
        JugadorCPU jC;
        Jugador j;
        colors.add("Vermell");
        colors.add("Verd");
        colors.add("Blau");
        colors.add("Groc");
        colors.add("Taronja");
        int x = 0;
        int t = 0;
        int u = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entra el nombre de jugadors que vols");
        int n = sc.nextInt();
        System.out.println("Entra jugadors CPU");
        x = sc.nextInt();
        t = sc.nextInt();
        u = sc.nextInt();
        
        for (int i = 1; i < n + 1 ; i++){
            if (i == x || i == t || i == u){
                j = new JugadorCPU(colors.get(i - 1),i);
                llistaJugadorsHuma.add(j);
            }
            else{
                j = new JugadorHuma(colors.get(i - 1),i);
                llistaJugadorsHuma.add(j);
            }
        }
        
        for (int i = 1; i < n + 1; i++){
                llistaJugadorsHuma.get(i - 1).mostrar();
        }
    }

}
