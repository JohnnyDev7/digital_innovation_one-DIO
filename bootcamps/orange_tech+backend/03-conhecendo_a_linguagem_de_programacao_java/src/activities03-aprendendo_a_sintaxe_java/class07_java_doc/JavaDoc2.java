package activities03.class07_java_doc;

// TIPOS DE COMENTÁRIOS:

// . One Line
// Olá! Eu sou um comentário em uma única linha.

/*
 * . Mult Line
 * Olá!
 * Eu sou um comentário
 * que posso ser mais detalhado
 * quando necessário.
 */

/**
 * . Documentation
 * Os dois asteriscos acima
 * são para identificar que você
 * pretende elaborar um comentário
 * a nível de documentação.
 * Que Incrível!!!
 */

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author  Johnny Souza
 * @version 1.0
 * @since   25/01/2022
 */

public class JavaDoc2 {
    
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int somar = calc.somar(3, 4);
        System.out.println("A soma dos dois números é igual a " + somar);
    }

}

class Calculadora {
/**
     * Este método é utilizado para somar dois números inteiros
     * @param n1 este é o primeiro parâmetro do método.
     * @param n2 este é o segundo parâmetro do método.
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int n1, int n2) {
        return n1 + n2;
    }
}