# Fundamentos da Programação Orientada a Objetos com Java

## Getters e Setters

Seguindo a convenção Java Beans

Os métodos *Getters* e *Setters* são utilizados para buscar valores de atributos ou definir novos valores de atributos de instâncias de classes.

O método *Getter* retorna o valor do atributo especificado.

O método *Setter* define outro novo valor para o atributo especificado.

Vemos o código abaixo da criação de um objeto *Aluno* com nome e idade:

> // Arquivo Aluno.java

    public class Aluno {
        String nome;
        int idade;
    }

> // Arquivo Escola.java

    public class Escola {
        public static void main(String[] args) {
            Aluno felipe = new Aluno();
            felipe.nome = "Felipe";
            felipe.idade = 8;

            System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade);
            // RESULTADO NO CONSOLE
            // O aluno Felipe tem 8 anos
        }
}

Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras abaixo:

- Os atributos precisam ter o modificador de acesso *private*. Exemplo: *private String nome;*
- Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos ***get**X* e ***set**X*. Exemplo: *getNome()* e *setNome(String novoNome)*.
- O método *get* é responsável por obter o valor atual do atributo, logo ele precisa ser *public* retornar um tipo correspondente ao valor. Exemplo *public String getNome() {};
- O método *set* é responsável por definir ou modificar o valor de um atributo em um objeto, logo ele também precisa ser public, receber um parâmetro do mesmo tipo da variável mas não retorna nenhum valor (void). Exemplo: *public void setNome(String newNome);

> // Arquivo Aluno.java

    public class Aluno {
        private String nome;
        private int idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String newNome) {
            nome = newNome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int newIdade) {
            idade = newIdade;
        }
    }

> // Arquivo Escola.java

    public class Escola {

        public static void main(String[] args) {
            Aluno felipe = new Aluno();
            felipe.setNome("Felipe");
            felipe.setIdade(8);

            System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos.");
            // RESULTADO NO CONSOLE
            // O aluno Felipe tem 8 anos.
        }

    }
