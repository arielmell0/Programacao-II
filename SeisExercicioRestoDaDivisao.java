import java.util.Scanner;

public class SeisExercicioRestoDaDivisao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y, resto;
        System.out.print("Digite o valor de x: ");
        x = teclado.nextInt();
        System.out.print("Digite o valor de y: ");
        y = teclado.nextInt();

        resto = x % y;

        System.out.println("O resto da divisão de x por y é: " + resto);
    }
}
