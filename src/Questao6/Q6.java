/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao6;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double a[] = new double[100];
        System.out.println("atribua 100 valores ao vetor!");
        for(int i=0; i < 100; i++){
            double n2 = leia.nextInt();
            a[i] = n2;
        }
        Inverter inv = new Inverter();
        System.out.println(inv.invertevetor(a, 0, 99));
    }
}
