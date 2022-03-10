import java.util.Scanner;

public class CincoExercicioDiasVividos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int idade, diasVividos;
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        diasVividos = idade * 365;

        System.out.println("Você viveu " + diasVividos + " dias!");
    }
}
