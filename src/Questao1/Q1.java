package Questao1;

    import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero:");
        int f = scan.nextInt();
        Fatorial fat = new Fatorial();
        System.out.println(fat.fatorial(f));
        
    }
    
}
