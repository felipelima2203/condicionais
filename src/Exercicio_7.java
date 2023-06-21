import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        double x, y;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores para X e Y (pressionando 'Enter' entre eles)");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x==0 && y==0){
            System.out.println("Origem");
        } else if (x==0){
            System.out.println("Eixo Y");
        } else if (y==0){
            System.out.println("Eixo X");
        } else if (x>0 && y>0){
            System.out.println("Q1");
        }else if (x>0 && y<0){
            System.out.println("Q4");
        }else if (x<0 && y>0){
            System.out.println("Q2");
        }else if (x<0 && y<0){
            System.out.println("Q3");
        }

        sc.close();
    }
}
