package activities03.class03_operadores;

public class Operadores6 {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;

        boolean questao = n1 == n2;
        System.out.println("Número 1 é igual a número 2? " + questao);

        questao = n1 != n2;
        System.out.println("Número 1 é diferente de número 2? " + questao);

        questao = n1 > n2;
        System.out.println("Número 1 é maior que número 2? " + questao);

        questao = n1 >= n2;
        System.out.println("Número 1 é maior/igual a número 2? " + questao);



        String nome1 = "JOHNNY";
        String nome2 = new String("JOHNNY");
        
        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));
    }
    
}
