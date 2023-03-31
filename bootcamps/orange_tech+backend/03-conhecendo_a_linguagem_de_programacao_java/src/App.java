/**
 * Criar um simples projeto no IntelliJ para realizar as comparações
 * do slide anterior, além de utilizar os demais tipos de dados não
 * apresentados.
 */

/**
 * Classe de exemplo para o exercício da Aula 1 de Operadores Lógicos
 * e Relacionais, Controle de Fluxo e Blocos.
 */

 public class App {

    public static void main(String[] args) {
            
        int i1 = 10, i2 = 20;
        float f1 = 4.5f, f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x', c2 = 'y';
        String s1 = "Fulano", s2 = "Fulano", s3 = "Cicrano";
        boolean b1 = true, b2 = false;

        long l1 = 1597L, l2 = 8797L;
        byte y = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

    }
}
