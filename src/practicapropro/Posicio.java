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
public class Posicio {
    private int x;
    private int y;
    
    Posicio (){
        x = 0;
        y = 0;
    }
    
    void AssignarPosicio(int x, int y){
        this.x = x;
        this.y = y;
    }
    Boolean esIgual (int x, int y){
        return this.x == x && this.y == y;
    }
    
    void llegirPosicio () {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }
    
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}
