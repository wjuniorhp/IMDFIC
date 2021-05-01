import java.util.Scanner;
import myTools.t;

public class Aula_9 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // programaFatorialIterativo();
        // programaFatorialRecursivo();
        System.out.println(fibonacci(6));
    }

    /* #region Atividade 1 */
    public static void programaFatorialIterativo() {
        System.out.println("Digite um número:");
        int numero = leitor.nextInt();
        int fat = fatorialIterativo(numero);
        if (fat > 0) {
            System.out.println("O fatorial desse número é " + fat);
        } else {
            System.out.println("Não existe fatorial para números negativos!");
        }
    }

    public static int fatorialIterativo(int numero) {
        int fat;
        if (numero < 0) {
            fat = -1;
        } else if (numero == 0) {
            fat = 1;
        } else {
            fat = 1;
            for (int i = 2; i <= numero; i++) {
                fat = fat * i;
            }
        }
        return fat;
    }

    public static void programaFatorialRecursivo() {
        System.out.println("Digite um número:");
        int numero = leitor.nextInt();
        int fat = t.fatorial(numero);
        if (fat > 0) {
            System.out.println("O fatorial desse número é " + fat);
        } else {
            System.out.println("Não existe fatorial para números negativos!");
        }
    }

    // a1_2) o modo recursivo. É mais legível.

    public static int fibonacci(int n) {
        int fib;
        switch (n) {
        case 0:
            fib = 0;
            break;
        case 1:
            fib = 1;
            break;
        default:
            fib = fibonacci(n - 1) + fibonacci(n - 2);
            break;
        }
        return fib;
    }
    /* #endregion */
    
}
