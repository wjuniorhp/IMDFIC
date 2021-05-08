
public class Labirinto {
    private static final char PAREDE_VERTICAL = '|';
    private static final char PAREDE_HORIZONTAL = '_';
    private static final char VAZIO = ' ';
    private static final char TAMANHO = 10;
    private static char[][] tabuleiro;

    public static void inicializarMatriz() {
        int i, j;
        for (i = 0; i < TAMANHO; i++) {
            tabuleiro[i][0] = PAREDE_VERTICAL;
            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;
            tabuleiro[0][i] = PAREDE_HORIZONTAL;
            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;
        }
        for (i = 1; i < TAMANHO - 1; i++) {
            for (j = 1; j < TAMANHO - 1; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
    }

    public static void imprimir() {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String Arg[]) {
        tabuleiro = new char[TAMANHO][TAMANHO];
        inicializarMatriz();
        imprimir();
    }
}
