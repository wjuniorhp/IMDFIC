import java.util.Scanner;
import myTools.t;

public class Semana3 {
    public static void main(String[] args) throws Exception {
        grenais();
    }

    public static void situacaoAluno() {
        System.out.println("Quais as suas notas?");
        float[] notas = t.floatArrayInput(3, "");
        float media = t.media(notas);
        System.out.print("Média = " + media + "  ====>  ");
        if (media < 3) {
            System.out.println("Reprovado");
        } else if (media < 7) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Aprovado");
        }
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0));
    }

    public static void ehBissexto() {
        int ano = Integer.parseInt(t.userInput("Digite um ano:"));
        if (t.ehBissexto(ano)) {
            System.out.println(ano + " é bissexto!");
        } else {
            System.out.println(ano + " não é bissexto...");
        }
    }

    public static void fibonacci() {
        int max = t.readInt("Quantos números na seguência vc quer?");

        int[] seq = t.fib(max);

        t.printArray(seq);
    }

    public static void fatorial() {
        int n = t.readInt("Quantos número vc quer saber o fatorial?");

        System.out.println(n + "! = " + t.fat(n));
    }

    public static void conversaoT() {
        float temp = Float.parseFloat(t.userInput("Qual a temperatura?"));
        String escala = t.userInput("Em qual escala é essa temperatura?");

        float celsius, farenheit, kelvin;
        switch (escala.toLowerCase().charAt(0)) {
        case 'c':
            celsius = temp;
            farenheit = celsius * 1.8f + 32;
            kelvin = celsius + 273.15f;
            break;
        case 'f':
            farenheit = temp;
            celsius = (farenheit - 32) / 1.8f;
            kelvin = celsius + 273.15f;
            break;
        case 'k':
            kelvin = temp;
            celsius = kelvin - 273.15f;
            farenheit = celsius * 1.8f + 32;
            break;
        default:
            kelvin = 0;
            celsius = 0;
            farenheit = 0;
            System.out.println("Tipo incorreto. Tente novamente");
            break;
        }

        System.out.println("Temperatura em Celsius:    " + celsius);
        System.out.println("Temperatura em Fahrenheit: " + farenheit);
        System.out.println("Temperatura em Kelvin:     " + kelvin);
    }

    public static void idadeEmDias() {
        int ndias = t.readInt("Quunatos dias de vida?");

        int anos = ndias / 365;
        int dias = ndias % 365;

        int mes = dias / 30;
        dias = dias % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }

    public static void grenais() {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        int golsInter, golsGremio;
        int ngrenais = 0;
        int vInter = 0, vGremio = 0, empates = 0;

        do {
            golsInter = leitor.nextInt();
            golsGremio = leitor.nextInt();

            if (golsInter > golsGremio) {
                vInter++;
            } else if (golsGremio > golsInter) {
                vGremio++;
            } else {
                empates++;
            }

            ngrenais++;
            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = leitor.nextInt();

        } while (opcao == 1);

        String vencedor="";
        if (vInter > vGremio) {
            vencedor = "Inter";
        } else if (vGremio > vInter) {
            vencedor = "Gremio";
        }

        System.out.println(ngrenais+" grenais");
        System.out.println("Inter:"+vInter);
        System.out.println("Gremio:"+vGremio);
        System.out.println("Empates:"+empates);
        if (vencedor!="") {
            System.out.println(vencedor+" venceu mais");
        } else {
            System.out.println("Não houve vencedor");
        }

        leitor.close();
    }
}