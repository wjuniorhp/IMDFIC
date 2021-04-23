package myTools;

import java.util.Scanner;

public class t {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
    }

    // #region Tools
    public static boolean ehPar(int n) {
        return (n % 2 == 0);
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0));
    }

    /* #region Contas */
    public static int maior(int[] valores) {
        int tam = valores.length;
        int maior = 0;
        for (int i = 0; i < tam; i++) {
            if (valores[i] > valores[maior]) {
                maior = i;
            }
        }
        return maior;
    }

    public static int menor(int[] valores) {
        int tam = valores.length;
        int menor = 0;
        for (int i = 0; i < tam; i++) {
            if (valores[i] < valores[menor]) {
                menor = i;
            }
        }
        return menor;
    }

    public static float media(float[] numeros) {
        float sum = soma(numeros);
        float m = sum / numeros.length;
        return m;
    }

    public static float soma(float[] numeros) {
        float soma = 0;
        for (float numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static int fat(int n) {
        int r = 1;
        for (int i = 2; i <= n; i++) {
            r *= i;
        }
        return r;
    }

    public static int[] fib(int max) {
        int[] seq = new int[max];
        seq[0] = 0;
        seq[1] = 1;
        for (int i = 2; i < max; i++) {
            seq[i] = seq[i - 2] + seq[i - 1];
        }
        return seq;
    }
    /* #endregion */

    /* #region Input */
    public static float[] floatArrayInput(int vezes, String texto) {
        float[] numeros = new float[vezes];
        for (int i = 0; i < vezes; i++) {
            numeros[i] = Float.parseFloat(userInput(texto));
        }
        return (numeros);
    }

    public static String userInput(String question) {
        if (question != "") {
            System.out.println(question);
        }
        System.out.print(">>>> ");
        String lido = leitor.nextLine();
        if (lido.isEmpty()) {
            lido = userInput("Vc não escreveu nada...Tente de Novo!");
        }
        return lido;
    }

    public static int readInt(String question) {
        if (question != "") {
            System.out.println(question);
        }
        System.out.print(">>>> ");
        int lido;
        if (leitor.hasNextInt()) {
            lido = leitor.nextInt();
        } else {
            lido = readInt("Vc não escreveu nada...Tente de Novo!");
        }
        return lido;
    }
    /* #endregion */

    /* #region Output */
    public static void printArray(String[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void printArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
    /* #endregion */

}