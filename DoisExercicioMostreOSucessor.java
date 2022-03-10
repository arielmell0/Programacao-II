import java.util.Scanner;

public class DoisExercicioMostreOSucessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, sucessor;
        System.out.print("Digite o número: ");
        x = teclado.nextInt();
        sucessor = x + 1;

        System.out.println("O sucessor desse número é: " + sucessor);
    }
}
