package activities03.class03_operadores;

public class Operadores4 {

    public static void main(String[] args) {
        // Operador de Incremento
        int numero = 5;
        System.out.println("O número inicial é: " + numero);
        // x repetição
        numero = numero + 1;
        System.out.println("O número inicial + 1 é: " + numero);
        
        numero = numero + 2;
        System.out.println("O número anterior + 2 é: " + numero);

        numero++;
        System.out.println("O número anterior ++ é: " + numero);

        System.out.println("Após está impressão, foi adicionado + 1 ao número " + numero ++);
        System.out.println("O número agora é: " + numero);
        System.out.println("++numero é: " + ++numero);


        System.out.println("");


        // Operador de Decremento
        System.out.println("O número inicial agora é: " + numero);
        // x repetição
        numero = numero - 1;
        System.out.println("O número inicial - 1 é: " + numero);
        
        numero = numero - 2;
        System.out.println("O número anterior - 2 é: " + numero);

        numero++;
        System.out.println("O número anterior -- é: " + numero);

        System.out.println("Após está impressão, foi subtraído 1 do número " + numero --);
        System.out.println("O número agora é: " + numero);
        System.out.println("--numero é: " + --numero);

        boolean variavel = false;
        System.out.println("O valor da variável pode ser: " + variavel + " ou " + !variavel);
        variavel = true;
        System.out.println(variavel);
    }
    
}
