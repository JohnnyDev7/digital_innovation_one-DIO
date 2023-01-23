package activities03.class01_anatomia_das_classes;
/**
 * Quando se trata de escrever códigos na linguagem Java, é recomendado
 * seguir algumas convenções de escrita.Esses padrões estão expressos nos
 * itens abaixo:
 * 
 *  - Arquivo ".java": Todo arquivo ".java" deve começar com letra MAIÚSCULA.
 * Se a palavra for composta, a segunda palavra deve também ser maiúscula.
 * Exemplo: Calculadora.java, CalculadoraCientifica.java
 */

// - Nome da classe no arquivo: A classe deve possuir o mesmo nome do arquivo.java
// Exemplo: arquivo -> AnatomiaDasClasses2.java
public class AnatomiaDasClasses2 {

    public static void main (String [] args) {

        /**
         *  - Nome da variável: Toda variável de ser escrita com letras minúsculas.
         * Porém, se a palavra for composta, a primeira letra da segunda palavra
         * deverá ser MAIÚSCULA.
         * Exemplo: "ano" e "anoFabricacao".
         * Esta prática para nomeação de variáveis é conhecida como "camelCase".
         */
        String ano;
        String anoFabricacao;

        /**
         * Existe uma regra adicional para variáveis quando na mesma queremos
         * identificar que ela não sofrerá alteração de valor.
         * Exemplo: Queremos determinar que uma variável de nome "br"
         * sempre representará "Brasil" e nunca terá o seu valor alterado.
         * Logo, utilizamos a seguinte forma de escrita: "BR".
         */

        // Alguns exemplos de declaração de variáveis:
        final String BR = "Brasil"; // A expressão "final" impede a alteração de valor atribuído.
        double PI = 3.14;
        int ESTADOS_BRASILEIROS = 27;
        int ANO_2000 = 2000;

        int dataAno = 2021;
        dataAno = 2022;
        
        /**
         * Recomendações: Para declarar uma variável, podemos utilizar caracteres, 
         * números e símbolos. Porém, devemos seguir algumas regras da linguagem.
         *  - Deve conter apenas letras, _ (underline), $ (cifrão) ou os números de 0 a 9;
         *  - Deve, obrigatoriamente, ser iniciada por uma letra (preferencialmente), "_"
         * ou "$". Jamais com número;
         *  - Deve ser iniciada com uma letra minúscula (boa prática - ver abaixo);
         *  - Não pode conter espaços;
         *  - Não podem ser usadas palavras-chave da linguagem;
         *  - O nome deve ser único dentro do escopo;
         */

         // Declaração de variáveis inválidas. Obs.: Os exemplos a seguir estão comentados
         // pois causariam erros em caso de execução do programa.
         //int numero&um = 1; // Os únicos símbolos permitidos são "_" e "$".
         //int 1numero = 1; // O nome de uma variável não pode começar com números.
         //int numero um = 1; // O nome de uma variável não pode conter espaços.
         //int long = 1; // Palavras resevadas da linguagem não podem ser utilizadas
         //                 para nomear variáveis.

         // Declarações de variáveis permitidas
         int numero$um = 1;
         int numero1 = 1;
         int numeroUm = 1;
         int longo = 1;

    }
}
