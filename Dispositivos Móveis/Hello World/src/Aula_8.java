import java.util.Scanner;
import myTools.t;

public class Aula_8 {
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // programaMedia();
        // programaFuncaoMedia();
        // programaFuncaoQuadrado();
        programaFuncaoMedia3();
    }

    /* #region Atividade 1 */
    public static void programaMedia() {
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = leitor.nextDouble();
        System.out.println("Digite a quarta nota:");
        double nota4 = leitor.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média foi: " + media);
    }

    public static void programaFuncaoMedia() {
        System.out.println("Digite a primeira nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = leitor.nextDouble();
        System.out.println("Digite a quarta nota:");
        double nota4 = leitor.nextDouble();
        double media = t.media(new double[] { nota1, nota2, nota3, nota4 });
        System.out.println("Sua média foi: " + media);
    }

    public static void programaFuncaoQuadrado() {
        System.out.println("Digite um número:");
        double num = leitor.nextDouble();
        System.out.println("O quadrado desse número é:" + quadrado(num));
        // ... Aqui o programa faz um monte de coisa
        // ... Aqui o programa faz um monte de coisa
        // ... Aqui o programa faz um monte de coisa
        // ... Aqui o programa faz um monte de coisa
        // ... Depois de muito código, precisa-se calcular
        // ... novamente o quadrado
        double num2 = leitor.nextDouble();
        System.out.println("O quadrado do segundo número digitado é:" + quadrado(num2));
    }

    public static double quadrado(double numero) {
        return numero * numero;
    }
    /* #endregion */

    /* #region Atividade 2 */
	public static final String APROVADO = "Aprovado"; 
	public static final String REPROVADO = "Reprovado"; 
	public static final String RECUPERACAO = "Em recuperação";
    public static void programaFuncaoMedia3() {
		pegarNotas(); 
    }
	private static void pegarNotas() { 
		System.out.println("Digite a primeira nota:"); 
		double nota1 = leitor.nextDouble(); 
		System.out.println("Digite a segunda nota:"); 
		double nota2 = leitor.nextDouble(); 
		System.out.println("Digite a terceira nota:"); 
		double nota3 = leitor.nextDouble(); 
		System.out.println("Digite a quarta nota:"); 
		double nota4 = leitor.nextDouble(); 
		double media = calcularMedia(nota1, nota2, nota3, nota4); 
		System.out.println("Sua média foi: " + media); 
		System.out.println("Resultado, você está " + verificarSituacaoAluno(media)); 
	} 

	public static String verificarSituacaoAluno(double media) { 
		if (media >= 7) { 
			return APROVADO; 
		} else if (media < 3) { 
			return REPROVADO; 
		} else { 
			return RECUPERACAO; 
		} 
	}

	public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) { 
		return (nota1 + nota2 + nota3 + nota4)/4; 
	}
    /* #endregion */
}
