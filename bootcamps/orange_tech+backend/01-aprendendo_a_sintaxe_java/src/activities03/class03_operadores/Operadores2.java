package activities03.class03_operadores;

public class Operadores2 {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println(nomeCompleto);

        // Qual o resultado das expressões abaixo?
        String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);
    }
    
}
