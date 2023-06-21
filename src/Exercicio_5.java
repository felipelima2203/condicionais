import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        int id, multiplier;
        double valor=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do item e a quantidade (pressionando 'Enter' entre eles)");
        id = sc.nextInt();
        multiplier = sc.nextInt();

        switch (id){

            case 1:
               valor = 4*multiplier;
               break;
            case 2:
                valor = 4.5*multiplier;
                break;
            case 3:
                valor = 5*multiplier;
                break;
            case 4:
                valor = 2*multiplier;
                break;
            case 5:
                valor = 1.5*multiplier;
                break;
            default:
                System.out.println("Item inválido");
        }

        if (multiplier<0){
            System.out.println("Quantidade inválida");
            valor = 0;
        }

        System.out.printf("Total: R$%.2f", valor);
        sc.close();
    }
}
