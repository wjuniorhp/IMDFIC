import java.util.Scanner;
import myTools.t;

public class Aula_6 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // programaNotasArray();
        // programaNotasArrayModificado();
        // programaForArray();
        // programaForArray2();
        // programaForArray2();
        a4_1();
    }

    /* #region Atividade 1 */
    public static void programaNotasArray() {
        System.out.println("Digite a quantidade de notas a serem lidas");
        int quantidade = leitor.nextInt();
        double notas[] = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota de número " + i);
            notas[i] = leitor.nextDouble();
        }
        // ... aqui, faz o processamento das notas
    }

    public static void programaNotasArrayModificado() {
        System.out.println("Digite a quantidade de notas a serem lidas");
        int quantidade = leitor.nextInt();
        double notas[] = new double[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota de número " + i);
            notas[i] = leitor.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(i + " - " + (i + 1) + " - Nota: " + notas[i]);
        }
        // ... aqui, faz o processamento das notas
    }
    /* #endregion */

    /* #region Atividade 2 */
    public static void a2_1() {
        String tipos[] = { "char", "short", "long", "float", "double" };
        int tamArray = 10;
        for (String tipo : tipos) {
            System.out.println("Tamanho de uma array do tipo " + tipo + " de " + tamArray + " elementos:");
            System.out.println(">>>>>\t" + (tamArray * t.tamElemento(tipo)) + " bytes    <<<<<");
        }
    }
    /* #endregion */

    /* #region Atividade 3 */
    public static void programaForArray() {
        int[] valores = new int[10]; // declara um vetor do tipo inteiro
        for (int i = 1; i <= 10; i++) { // inicia o laço com i de 1 ao tamanho do vetor
            valores[i] = leitor.nextInt(); // o indice de valor i do vetor recebe um valor do tipo inteiro do usuario
        }
    }

    public static void programaForArray2() {
        System.out.println("Digite a quantidade de valores a digitar:");
        int[] valores = new int[leitor.nextInt()];
        System.out.println("Digite agora os valores:");
        for (int i = 0; i < 10; i++) {
            valores[i] = leitor.nextInt();
        }
        System.out.println("Valores digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(valores[i]);
        }
    }

    public static void programaForArray3() {
        System.out.println("Digite a quantidade de valores a digitar:");
        int[] valores = new int[leitor.nextInt()];
        System.out.println("Digite agora os valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = leitor.nextInt();
        }
        System.out.println("Valores digitados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
    /* #endregion */

    /* #region Atividade 4 */
    public static void a4_1() {
        int M = t.readInt("Quantas linhas?");
        int N = t.readInt("Quantas colunas?");

        int matriz[][] = new int[M][N];
        System.out.println("Digite a Matriz");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = leitor.nextInt();
            }
        }

        System.out.println("Maior elemento: "+t.maiorMat(matriz));
        // t.printMatrix(matriz);
    }
    /* #endregion */
}
