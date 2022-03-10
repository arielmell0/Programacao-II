import java.util.Scanner;

public class SeteExercicioReajusteSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste, novoSalario;
        System.out.print("Digite o salário do funcionário: ");
        salario = teclado.nextInt();

        reajuste = salario * 0.07;
        novoSalario = salario + reajuste;

        System.out.println("O novo salário reajustado é: " + novoSalario);
    }
}
