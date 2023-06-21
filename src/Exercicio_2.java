import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        int num=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        num = sc.nextInt();
        if (num%2==0) System.out.println("PAR");
        else System.out.println("IMPAR");

        sc.close();


    }
}
