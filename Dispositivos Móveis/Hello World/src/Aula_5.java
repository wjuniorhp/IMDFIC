import java.util.Scanner;

public class Aula_5 {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // ProgramaForAsterisco();
        // ProgramaFor2();
        // ProgramaForInfinito();
        // a1_4();
        // ProgramaWhileSorteio();
        // ProgramaForSorteio();
        // ProgramaDoWhileSorteio();
        a3_2();
    }

    // #region Atividade 1
    public static void ProgramaForAsterisco() {
        String texto = "*";
        for (int i = 1; i <= 10; i++) {
            System.out.println(texto);
            texto = texto + "*";
        }
    }

    public static void ProgramaFor2() {
        String texto = "*";
        // Não escreve nada pois a condicao ja comeca falsa
        for (int i = 10; i < 10; i++) {
            System.out.println(texto);
            texto = texto + "*";
        }
    }

    public static void ProgramaForInfinito() {
        for (int i = 1; i < 10;) {
            System.out.println("Olá");
        }
    }

    public static void a1_4() {
        int n = 1;
        for (;;) {
            System.out.println(n);
            n++;
        }
    }
    // #endregion

    // #region Atividade 2
    public static void ProgramaFor() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void ProgramaWhileSorteio() {
        long numero = Math.round(Math.random() * 10);
        long chute;
        System.out.println("Digite um número entre 1 e 10");
        chute = leitor.nextLong();
        while (numero != chute) {
            System.out.println("Digite um número entre 1 e 10");
            chute = leitor.nextLong();
        }
        System.out.println("Você acertou!");
    }

    public static void ProgramaForSorteio() {
        long numero = Math.round(Math.random() * 10);
        long chute;
        System.out.println("Digite um número entre 1 e 10");
        chute = leitor.nextLong();
        for (; numero != chute;) {
            System.out.println("Digite um número entre 1 e 10");
            chute = leitor.nextLong();
        }
        System.out.println("Você acertou!");
    }
    // #endregion

    // #region Atividade 3
    public static void ProgramaWhileSorteio2() {
        long numero = Math.round(Math.random() * 10);
        long chute = -1;
        while (numero != chute) {
            System.out.println("Digite um número entre 1 e 10");
            chute = leitor.nextLong();
        }
        System.out.println("Você acertou!");
    }

    public static void ProgramaDoWhileSorteio() {
        long numero = Math.round(Math.random() * 10); 
		long chute; 
		do { 
			System.out.println("Digite um número entre 1 e 10"); 
			chute = leitor.nextLong(); 
		} while (numero != chute); 
		System.out.println("Você acertou!"); 
    }

    public static void a3_2(){
        int n;
        while (true) {
            n = leitor.nextInt();
            if (n*n == 0) {
                break;
            } else {
                System.out.println(n*n);
            }
        }
    }
    // #endregion
}
