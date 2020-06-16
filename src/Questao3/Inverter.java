/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3;

/**
 *
 * @author danta
 */
public class Inverter {
    int x;
    public int inverter(int n){
        if(n == 0){
            return this.x;
        }else{
            this.x = x*10;
            this.x = x+(n%10);
            return inverter(n/10);
        }
    }
}
