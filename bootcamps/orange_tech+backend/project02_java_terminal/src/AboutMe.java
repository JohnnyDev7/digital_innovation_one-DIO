import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String [] args) {
        // Os argumentos começam com indice 0
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá!!! Me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " m");

        // Criando o objeto scanner
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nomeUsuario = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenomeUsuario = scanner.next();

        System.out.println("Digite sua idade");
        int idadeUsuario = scanner.nextInt();

        System.out.println("Digite sua altura");
        double alturaUsuario = scanner.nextDouble();

        // Imprimindo os dados obtidos pelo usuário.
        System.out.println("Olá!!! Me chamo " + nomeUsuario + " " + sobrenomeUsuario);
        System.out.println("Tenho " + idadeUsuario + " anos");
        System.out.println("Minha altura é " + alturaUsuario + "m");
    }
}
