import java.util.Scanner;

public class Aula_4 {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        a1_1(5);

        leitor.close();
    }

    public static void a1_1(int vezes) {
        int[] numeros = new int[vezes];
        // int soma = 0;

        numeros = intArrayInput(vezes, "Digite um numero: ");
        int soma = soma(numeros);

        if (ehPar(soma)) {
            System.out.println(soma + " é múltiplo de 2!");
        } else {
            System.out.println(soma + " não é múltiplo de 2...");
        }
    }

    public static void a1_2() {

    }

    // #region Tools
    public static boolean ehPar(int n) {
        return (n % 2 == 0);
    }

    public static float media(float[] numeros) {
        return soma(numeros) / numeros.length;
    }

    public static int soma(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static int[] intArrayInput(int vezes, String texto) {
        int[] numeros = new int[vezes];
        for (int i = 0; i < vezes; i++) {
            numeros[i] = Integer.parseInt(userInput(texto));
        }
        return (numeros);
    }

    public static String userInput(String question) {
        System.out.print(question + "\n>>>> ");
        String lido = leitor.nextLine();
        return lido;
    }
    // #endregion
}
