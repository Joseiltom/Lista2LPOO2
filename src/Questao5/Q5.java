/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao5;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um numero para fazer a soma de 1 até ele");
        int n = leia.nextInt();
        Somatoria soma = new Somatoria();
        System.out.println(soma.somatoria(n));
    }
}
