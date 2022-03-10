import java.util.Scanner;

public class OitoExercicioConversaoDolar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorEmDolar, valorEmReal;
        System.out.println("Digite o valor em Dolar: ");
        valorEmDolar = teclado.nextDouble();

        valorEmReal = valorEmDolar * 1.82;
        System.out.println("O valor em Real é: " + valorEmReal);
    }
}
