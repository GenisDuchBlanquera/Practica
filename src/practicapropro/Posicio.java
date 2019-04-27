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
}
