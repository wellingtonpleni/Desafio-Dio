import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(50);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Curso de Python");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aprendendo Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Start");
        bootcamp.setDescricao("Seja um desenvolvedor Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Wellington");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
