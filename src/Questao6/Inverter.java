/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao6;

/**
 *
 * @author danta
 */
public class Inverter {
    double temp;
    public String invertevetor(double a[], int n, int m){
        if(n > m){
            return "Vetor invertido com sucesso";
        }else{
            temp = a[n];
            a[n] = a[m];
            a[m] = temp;
            return invertevetor(a, n+1, m-1);
        }
    }
}
