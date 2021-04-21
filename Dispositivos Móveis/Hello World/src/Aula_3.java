import java.util.Scanner;

public class Aula_3 {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // programaPrintln();
        // a1_2("Wellington","Rocha");
        // a1_3(20, 30);
        // programaLeitorTeclado();
        // a2_2(3);
        a2_3();

        leitor.close();
    }

    // #region Atividade 1
    public static void programaPrintln() {
        int x = 10;
        double y = 10.2;
        System.out.println("Esta mensagem será impressa na tela!");
        System.out.println("O valor da variável x é " + x);
        System.out.println("Os valores de x e y são " + x + " e " + y);
        System.out.println("Linha 1\nLinha 2");
        System.out.println("#####################################################");

        System.out.println("Aspas simples: \' ");
        System.out.println("Barra invertida: \\ ");
        System.out.println("Aspas duplas: \" ");
        System.out.println("Tabulação:\tnome\tsobrenome");
    }

    public static void a1_2(String nome, String sobrenome) {
        // Imprimir nome completo
        System.out.println("Meu nome é " + nome + " " + sobrenome);
    }

    public static void a1_3(float base, float altura) {
        // Calcula a area de um retangulo
        float area = base * altura;
        System.out.println("Area = " + Math.round(area));

    }
    // #endregion

    // #region Atividade 2
    public static void programaLeitorTeclado() {
        String nome = userInput("Digite seu nome:");

        int idade = Integer.parseInt(userInput("Olá, " + nome + ", digite agora sua idade:"));
        System.out.println(idade + " anos, muito bem!");

        double altura = Double.parseDouble(userInput("Digite agora sua altura:"));
        System.out.println("Ok, entendi, você tem " + altura + "m de altura.");
    }

    public static void a2_2(int vezes) {
        String[] frases = new String[vezes];
        for (int i = 0; i < vezes; i++) {
            frases[i] = userInput("Digite uma frase:");
        }
        for (int i = vezes - 1; i >= 0; i--) {
            System.out.println(frases[i]);
        }
    }

    public static void a2_3() {
        String aluno, disciplina;
        float[] notas = new float[4];
        aluno = userInput("Nome do aluno: ");
        disciplina = userInput("Qual a matéria? ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Float.parseFloat(userInput("Digite a nota " + (i + 1) + ": "));
        }
        System.out.println(aluno + " ficou com media " + media(notas) + " em " + disciplina);

    }
    // #endregion

    public static float media(float[] numeros) {
        float soma = 0.0F;
        for (float numero : numeros) {
            soma += numero;
        }
        return soma / numeros.length;
    }

    public static String userInput(String question) {
        System.out.print(question + "\n>>>> ");
        String lido = leitor.nextLine();
        return lido;
    }
}
