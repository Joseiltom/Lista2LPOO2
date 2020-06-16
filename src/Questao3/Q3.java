package Questao3;

    import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero:");
        int n = scan.nextInt();
        Inverter inv = new Inverter();
        System.out.println(inv.inverter(n));
    }
}
