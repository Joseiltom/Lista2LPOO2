/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

/**
 *
 * @author danta
 */
public class Soma {
    int somatotal;
    public int soma(int a[], int cont){
        if(cont == -1){
            return somatotal;
        }else{
            this.somatotal = somatotal+a[cont];
            return soma(a, cont-1);
        }
    }
}
