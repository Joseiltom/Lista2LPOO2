package Questao2;

    import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int n = scan.nextInt();
        Fibonacci robert = new Fibonacci();
        System.out.println(robert.fibonacci(n));
    }
}
