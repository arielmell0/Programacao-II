import java.util.Scanner;

public class TresExercicioMostreOAntecessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, antecessor;

        System.out.print("Digite o número: ");
        x = teclado.nextInt();
        antecessor = x - 1;

        System.out.println("O antecessor de x é: " + antecessor);
    }
}
