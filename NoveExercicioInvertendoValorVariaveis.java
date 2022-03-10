import java.util.Scanner;

public class NoveExercicioInvertendoValorVariaveis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y, auxiliar;
        System.out.print("Digite o valor de x: ");
        x = teclado.nextInt();
        System.out.print("Digite o valor de y: ");
        y = teclado.nextInt();
        
        auxiliar = x;
        x = y;
        y = auxiliar;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }   
}
