import java.util.Scanner;
import myTools.t;

public class Aula_7 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // programaEquals();
        // programaEqualsUpperCase();
        // programaEqualsLowerCase();
        // programaEqualsIgnoreCase();
        // programaStringCaracteres();
        // programaString();
        // a4_2();
        // programaStringPosicaoChar();
        // programaSubstring();
        programaSubstringModificado();
    }

    /* #region Atividade 1 */
    public static void programaEquals() {
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }

    // a1_2) Quando passo 2 palavras só mudando o case, ele identifica como sendo
    // duas palavras diferentes
    /* #endregion */

    /* #region Atividade 2 */
    public static void programaEqualsUpperCase() {
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
        System.out.println(nome1);
        System.out.println(nome2);
    }

    public static void programaEqualsLowerCase() {
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        nome1 = nome1.toLowerCase();
        nome2 = nome2.toLowerCase();
        if (nome1.equals(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
        System.out.println(nome1);
        System.out.println(nome2);
    }
    /* #endregion */

    /* #region Atividade 3 */
    public static void programaEqualsIgnoreCase() {
        System.out.println("Digite o primeiro nome:");
        String nome1 = leitor.next();
        System.out.println("Digite o segundo nome:");
        String nome2 = leitor.next();
        if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }
    /* #endregion */

    /* #region Atividade 4 */
    public static void programaStringCaracteres() {
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        char[] caracteres = nome1.toCharArray();
        System.out.println("Inverso:");
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(caracteres[i]);
        }
    }

    public static void programaString() {
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        System.out.println("Inverso:");
        for (int i = nome1.length() - 1; i >= 0; i--) {
            System.out.print(nome1.charAt(i));
        }
    }

    public static void a4_2() {
        String palavra = t.userInput("Digite alguma coisa");

        for (int i = 0; i < palavra.length(); i++) {
            if (i % 2 == 1) {
                System.out.print(palavra.charAt(i) + " ");
            }
        }
    }
    /* #endregion */

    /* #region Atividade 5 */
    public static void programaStringPosicaoChar() {
        System.out.println("Digite uma palavra:");
        String nome1 = leitor.next();
        char ponto = '.';
        int inicio = 0;
        int posicao = nome1.indexOf(ponto);
        System.out.println("Existe ponto nas posições: ");
        while (inicio < nome1.length() && posicao != -1) {
            System.out.println(posicao);
            inicio = posicao + 1;
            posicao = nome1.indexOf(ponto, inicio);
        }
    }
    /* #endregion */

    /* #region Atividade 6 */
    public static void programaSubstring() {
        System.out.println("Digite seu nome completo:");
        String nome = leitor.next();
        if (nome.length() >= 4 && nome.substring(0, 4).equalsIgnoreCase("João")) {
            System.out.println("Olá João!");
        } else {
            System.out.println("Epa, você não é João!");
        }
    }

    public static void programaSubstringModificado() {
        System.out.println("Digite seu nome completo:");
        String nome = leitor.next();
        if (nome.substring(0, 4).equalsIgnoreCase("João")) {
            System.out.println("Olá João!");
        } else {
            System.out.println("Epa, você não é João!");
        }
    }
    /* #endregion */
}
