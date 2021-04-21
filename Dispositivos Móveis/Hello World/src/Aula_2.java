public class Aula_2 {
    public static int varGlobal = 20;
    private static int varLocalClasse = 6;

    public static void main(String[] args) {
        int varLocalRotina = 10;

        if (varGlobal == 0) {
            int varLocalComando = varLocalRotina;
            System.out.println(varLocalComando);
        }
        // System.out.println(varLocalRotina);
        // System.out.println(varLocalComando);
        // rotina2();
        a1();

    }

    public static void rotina2() {
        // System.out.println(varLocalRotina);
        // System.out.println(varLocalComando);
        System.out.println(varGlobal);
        System.out.println(varLocalClasse);
    }

    public static void a1() {
        String[] letras = {"g","a","t","o"};
        System.out.println(letras[0]+"55");

    }
}
