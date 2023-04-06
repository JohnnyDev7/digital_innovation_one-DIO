/**
 * Criar um simples projeto no IntelliJ e codificar os exemplos dos
 * slides para compreender as operações lógicas.
 * Utilize operandos e expressões.
 */

 /**
  * Classe de exemplo para o exercício da Aula 2 sobre Operadores
  * Lógicos e Relacionais, Controle de Fluxo e Blocos.
  */

 public class OL04ResolucaoDoExercicio {

    public static void main(String[] args) {
        
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        System.out.println("!b1 " + (!b1));
        System.out.println("!b2 " + (!b2));

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println();
    }

 }