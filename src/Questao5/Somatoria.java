/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;

/**
 *
 * @author danta
 */
public class Somatoria {
    int soma=1;
    public int somatoria(int n){
        if(n == 1){
            return soma;
        }else{
            soma = soma+n;
            return somatoria(n-1);
        }
    }
}
