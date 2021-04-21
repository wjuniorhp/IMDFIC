import java.util.Scanner;

public class Aula_4 {
    public static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // a1_1(5);
        // a1_2();
        // a2_1();
        // a2_2(2);
        // comparaNumero();
        // a3_2();
        // ProgramaExemplo();
        a4_2();

        leitor.close();
    }

    // #region Atividade 1
    public static void a1_1(int vezes) {
        float[] numeros = new float[vezes];

        numeros = floatArrayInput(vezes, "Digite um numero: ");
        float soma = soma(numeros);

        if (ehPar((int) soma)) {
            System.out.println((int) soma + " é múltiplo de 2!");
        } else {
            System.out.println((int) soma + " não é múltiplo de 2...");
        }
    }

    public static void a1_2() {
        float[] comprimento = new float[3];
        comprimento = floatArrayInput(3, "Digite um comprimento: ");
        boolean ehTriangulo = true;

        for (int i = 0; i < comprimento.length; i++) {
            ehTriangulo = ehTriangulo && comprimento[i] < comprimento[(i + 1) % 3] + comprimento[(i + 2) % 3];
        }

        if (ehTriangulo) {
            System.out.println("É triangulo");
        } else {
            System.out.println("Não é triangulo");
        }

    }
    // #endregion

    // #region Atividade 2
    public static void a2_1() {
        int n = Integer.parseInt(userInput("Digite um numero"));
        if (ehPar(n)) {
            System.out.println(n + " é par!");
        } else {
            System.out.println(n + " é impar!");
        }
    }

    public static void a2_2(int qtd) {
        String[] nome = new String[qtd];
        int[] ano = new int[qtd];
        for (int i = 0; i < qtd; i++) {
            nome[i] = userInput("Diga o nome da " + (i + 1) + "ª pessoa");
            ano[i] = Integer.parseInt(userInput("Em que ano " + nome[i] + " nasceu?"));
        }
        int maisVelho = menor(ano);
        System.out.println(nome[maisVelho] + " é o mais velho.");
    }

    // #endregion

    // #region Atividade 3
    public static void comparaNumero() {
        int[] n = new int[2];
        for (int i = 0; i < 2; i++) {
            n[i] = Integer.parseInt(userInput("Digite um numero"));
        }
        if (n[0] != n[1]) {
            System.out.println("O maior número foi " + n[maior(n)]);
        } else {
            System.out.println("Os dois números são iguais");
        }
    }

    public static void a3_2() {
        float nota = -1;
        while (nota < 0 || nota > 10) {
            nota = Float.parseFloat(userInput("Digita aí "));
        }
        if (nota < 3) {
            System.out.println("Você precisa melhorar muito!");
        } else if (nota < 7) {
            System.out.println("Você está quase conseguindo!");
        } else if (nota < 9) {
            System.out.println("Você conseguiu!");
        } else {
            System.out.println("Você conseguiu com distinção!");
        }
    }
    // #endregion

    // #region Atividade 4
    public static void ProgramaExemplo() {
        int numero;
        System.out.println("Digite um número:");
        numero = leitor.nextInt();
        switch (numero) {
        case 9:
            System.out.println("O número é igual a 9.");
            break;
        case 10:
            System.out.println("O número é igual a 10.");
            break;
        case 11:
            System.out.println("O número é igual a 11.");
            break;
        default:
            System.out.println("O número não é nem 9, nem 10, nem 11.");
        }
    }

    public static void a4_2(){
        // char[] letras = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String[] countries = new String[]{"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"};

        char letra = userInput("Diga uma letra").charAt(0);
        boolean achou = false;
        for (String country : countries) {
            if (Character.toUpperCase(letra) == country.toUpperCase().charAt(0)) {
                System.out.println("ACHEI! "+country);
                achou = true;
                break;
            }
        }
        if (!achou) {
            System.out.println("Não achou nenhum país");
        }
    }

    // #endregion

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
