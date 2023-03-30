package activities03.class03_operadores;

public class Operadores5 {

    public static void main(String[] args) {
        int n1, n2;
        boolean resultado;

        n1 = 5;
        n2 = 6;

        // Utilizando if/else
        if (n1 == n2)
            resultado = true;
        else
            resultado = false;

        System.out.println("Utilizando else/if para verificar se n1 é igual a n2: " + resultado );

        // Utilizando Operador Ternário
        System.out.print("Utilizando Operador Ternário para verificar se n1 é diferente de n2: ");
        String resposta = n1 != n2 ? "Verdadeiro" : "Falso";
        int intResp = n1 != n2 ? 1 : 0;

        System.out.println(resposta);
        System.out.println(intResp);
        }
}
