import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        int start, end;
        int duration;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores para hora inicial e final do jogo (pressionando 'Enter' entre eles)");
        start = sc.nextInt();
        end = sc.nextInt();

        if (start > end) {
            duration = 24-start+end;
            System.out.printf("O JOGO DUROU %d HORA(S)", duration);
        } else if (start < end){
            duration = end - start;
            System.out.printf("O JOGO DUROU %d HORA(S)", duration);
        }
        else {
            duration = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)", duration);
        }
    }
}
