/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("qual o tamanho do vetor?");
        int n = leia.nextInt();
        int a[] = new int[n];
        System.out.println("atribua os valores ao vetor!");
        for(int i=0; i < n; i++){
            int n2 = leia.nextInt();
            a[i] = n2;
        }
        Soma soma = new Soma();
        System.out.println(soma.soma(a, n-1));
    }
}
