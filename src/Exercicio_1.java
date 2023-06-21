import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        num = sc.nextInt();

        if (num<0) System.out.println("NEGATIVO");
        else System.out.println("NAO NEGATIVO");


        sc.close();


    }
}