/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao7;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = leia.nextInt();
        System.out.println("Digite um numero para que seja verificado a quantidade desse numero no numero anterior");
        int m = leia.nextInt();
        Numero num = new Numero();
        System.out.println(num.numerodenumeros(n, m)+" numeros "+m);
    }
}
