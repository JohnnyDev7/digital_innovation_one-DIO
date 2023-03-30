package activities03.class01_anatomia_das_classes;
/**
 * INDENTAÇÃO
 * Indentar é m termo que se refere à forma como o código é escrito
 * hierarquicamente, facilitando, assim, a visualização e o entendimento.
 * Abaixo, veja o exemplo de um algoritmo de validação de estudante com
 * o código sem indentação e, o mesmo código, escrito com indentação.
 */
public class AnatomiaDasClasses4 {
    
    public static void main (String [] args) {

        boletimEstudantil1(6);
        boletimEstudantil2(3);
    }

    // Código sem indentação 
    public static void boletimEstudantil1(int media) {
    int mediaFinal = media;
    if (mediaFinal < 6)
    System.out.println("REPROVADO");
    else if (mediaFinal == 6)
    System.out.println("PROVA DE MINERVA");
    else
    System.out.println("APROVADO");
    }

    // Código com indentação 
    public static void boletimEstudantil2(int media) {
        int mediaFinal = media;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA DE MINERVA");
        else
            System.out.println("APROVADO");
        }
}
