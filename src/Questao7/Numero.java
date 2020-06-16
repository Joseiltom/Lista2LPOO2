/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao7;

/**
 *
 * @author danta
 */
public class Numero {
    int cont;
    public int numerodenumeros(int n, int m){
        if(n == 0){
            return cont;
        }else{
            if(n%10 == m){
                cont++;
            }
            return numerodenumeros(n/10, m);
        }
    }
}
