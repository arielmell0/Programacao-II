import java.util.Scanner;

public class DezExercicioSaudacoesUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;

        System.out.print("Digite o seu nome: ");
        nome = teclado.next();
        System.out.println("Olá " + nome + "!");
    }
}
