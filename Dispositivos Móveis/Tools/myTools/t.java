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

    public static int tamElemento(String tipo) {
        int tam;
        switch (tipo) {
        case "byte":
            tam = 1;
            break;
        case "char":
            tam = 2;
            break;
        case "short":
            tam = 2;
            break;
        case "int":
            tam = 4;
            break;
        case "long":
            tam = 8;
            break;
        case "float":
            tam = 4;
            break;
        case "double":
            tam = 8;
            break;
        default:
            tam = 0;
            break;
        }
        return tam;
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

    public static int maiorMat(int matriz[][]){
        int nlins = matriz.length;
        int maiorDasLinhas[] = new int[nlins];
        for (int i = 0; i < nlins; i++) {
            maiorDasLinhas[i] = matriz[i][maior(matriz[i])];
        }

        return maiorDasLinhas[maior(maiorDasLinhas)];
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
    public static double media(double[] numeros) {
        double sum = soma(numeros);
        double m = sum / numeros.length;
        return m;
    }

    public static float soma(float[] numeros) {
        float soma = 0;
        for (float numero : numeros) {
            soma += numero;
        }
        return soma;
    }
    public static double soma(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static int fatorial(int n) {
        int fat; 
		if (n < 0) { 
			fat = -1; 
		} else if (n == 0) { 
			fat = 1; 
		} else { 
			fat = fatorial(n - 1) * n; 
		} 
		return fat; 
    }

    public static int[] fibSeq(int max) {
        //retorna a sequencia de fibonacci
        int[] seq = new int[max];
        for (int i = 0; i < max; i++) {
            seq[i] = fibonacci(i+1);
        }
        return seq;
    }
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

    public static void printMatrix(int m[][]){
        for (int[] linha : m) {
            for (int coluna : linha) {
                System.out.print(coluna+" ");
            }
            System.out.println();
        }
    }
    /* #endregion */

}