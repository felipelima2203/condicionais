import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para A e B (pressionando 'Enter' entre eles)");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a%b==0) System.out.println("Sao Multiplos");
        else if (b%a==0) System.out.println("Sao Multiplos");
        else System.out.println("Nao sao Multiplos");
        sc.close();
    }
}
