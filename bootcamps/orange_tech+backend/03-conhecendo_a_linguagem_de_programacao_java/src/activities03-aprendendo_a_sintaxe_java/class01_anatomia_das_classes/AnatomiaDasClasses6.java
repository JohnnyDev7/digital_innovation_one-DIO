package activities03.class01_anatomia_das_classes;

/**
 * JAVA BEANS
 * Uma das maiores dificuldades na programação é escrever algoritmos legíveis
 * a níveis que sejam compreendidos por todo o seu time ou, por você mesmo no futuro.
 * Para isso a linguagem Java sugere, através de convenções, formas de escrita
 * universal para nossas classes, atributos, métodos e pacotes.
 * 
 * -> Variáveis
 * Mais cedo, já aprendemos algumas regras de declaração de variáveis. Mas agora
 * iremos conhecer algumas sugestões de nomenclatura:
 * . Uma variável deve ser clara, sem abreviações ou definições sem sentido;
 * . Uma variável é sempre no singular, exceto quando se referir à uma array ou coleção;
 * . Defina um idioma único para suas variáveis. Se você for declarar variáveis em
 * inglês, defina todas em inglês
 * 
 * -> Métodos
 * Os métodos deverão ser nomeados como verbos, através de uma mistura de
 * letras minúsculas e maiúsculas. Em princípio, todas as letras que compõem
 * o nome devem ser mantidas em minúsculo, com exceção da primeira letra de
 * cada palavra composta a partir da segunda palavra.
 */

public class AnatomiaDasClasses6 {

    // Exemplos de variáveis escritas de forma não recomendada:
    double salMedio = 1500.23; // Variável abreviada.
    String emails = "aluno@escola.com"; // Confuso se a variável representa apenas um item.
    String myName = "JOSEPH"; // Evite misturar idiomas em um mesmo projeto
    
    // Exemplos de variáveis escritas de forma recomendada:
    double salarioMedio = 1500.23;
    String email = "aluno@escola.com";
    String [] eMails = {"aluno@escola.com", "professor@escola.com"};
    String meuNome = "JOSEPH";

    public static void main(String[] args) {
        
    }

    // Exemplos de métodos escritos de forma recomendada:
    public void somar (int n1, int n2) {}
    public void abrirConexao() {}
    public void concluirProcessamento() {}
    // Métodos escritos em inglês são bastante comuns na programação.
    public void findById(int id) {}
    
    // Há algo de errado no método abaixo. Deveria haver uma única finalidade.
    public void calcularImprimir() {}
}
