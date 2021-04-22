package Tools;
import java.util.Scanner;

public class Tools {
    public static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {
    }
    
    // #region Tools
    public static boolean ehPar(int n) {
        return (n % 2 == 0);
    }

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

    public static float[] floatArrayInput(int vezes, String texto) {
        float[] numeros = new float[vezes];
        for (int i = 0; i < vezes; i++) {
            numeros[i] = Float.parseFloat(userInput(texto));
        }
        return (numeros);
    }

    public static String userInput(String question) {
        System.out.print(question + "\n>>>> ");
        String lido = leitor.nextLine();
        if (lido.isEmpty()) {
            lido = userInput("Vc não escreveu nada...Tente de Novo!");
        }
        return lido;
    }
    // #endregion
}