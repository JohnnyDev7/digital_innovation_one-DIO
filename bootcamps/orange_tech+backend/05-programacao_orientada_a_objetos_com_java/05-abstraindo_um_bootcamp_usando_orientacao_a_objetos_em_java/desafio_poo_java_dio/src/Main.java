import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mantoria Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJohnny = new Dev();
        devJohnny.setNome("Johnny");
        devJohnny.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Johnny" + devJohnny.getConteudosInscritos());
        devJohnny.progredir();
        devJohnny.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Johnny" + devJohnny.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Johnny" + devJohnny.getConteudosConcluidos());
        System.out.println("XP:" + devJohnny.calcularTotalXP());

        System.out.println("-------------");

        Dev devLivia = new Dev();
        devLivia.setNome("Lívia");
        devLivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lívia" + devLivia.getConteudosInscritos());
        devLivia.progredir();
        devLivia.progredir();
        devLivia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lívia" + devLivia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lívia" + devLivia.getConteudosConcluidos());
        System.out.println("XP:" + devLivia.calcularTotalXP());

    }
}