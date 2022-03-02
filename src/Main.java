import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao, opcao2;
        String nome;
        Scanner entrada = new Scanner(System.in);

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(50);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("DIO");
        bootcamp.setDescricao("Seja um desenvolvedor Java");
        bootcamp.getConteudos().add(curso);

        do{
            System.out.println("------------Bootcamp------------");
            System.out.println("1 - Realizar Cadastro");
            System.out.println("2 - Sair");
            System.out.print("Digite sua Opção: ");

            opcao = entrada.nextInt();

            if (opcao == 1){
                    int cadastro;
                    System.out.println("------------Cadastro------------");
                    System.out.print("Escreva seu nome: ");
                    nome = entrada.next();
                    System.out.println("1 - Confirmar");
                    System.out.println("2 - Cancelar");
                    System.out.print("Digite sua Opção: ");
                    cadastro = entrada.nextInt();

                    if (cadastro == 1){
                        Dev dev = new Dev();
                        dev.setNome(nome);

                        do {
                            System.out.println("------------Inscrição------------");
                            System.out.println("Deseja se inscrever no Bootcamp DIO?");
                            System.out.println("1 - Confirmar");
                            System.out.println("2 - Cancelar");
                            System.out.print("Digite sua Opção: ");
                            opcao2 = entrada.nextInt();

                            if (opcao2 == 1){
                                    int cadastro2;
                                    dev.inscreverBootcamp(bootcamp);

                                    System.out.println("Deseja se inscrever na mentoria?");
                                    System.out.println("1 - Confirmar");
                                    System.out.println("2 - Cancelar");
                                    System.out.print("Digite sua Opção: ");
                                    cadastro2 = entrada.nextInt();

                                    if (cadastro2 == 1) {
                                        int cadastro3;

                                        Mentoria mentoria = new Mentoria();
                                        mentoria.setTitulo("Mentoria de Java");
                                        mentoria.setDescricao("Aprendendo Java");
                                        mentoria.setData(LocalDate.now());

                                        System.out.println("Deseja visualizar conteúdo inscrito?");
                                        System.out.println("1 - Confirmar");
                                        System.out.println("2 - Cancelar");
                                        System.out.print("Digite sua Opção: ");
                                        cadastro3 = entrada.nextInt();

                                        if (cadastro3 == 1) {
                                            System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
                                        }

                                    }
                            }
                        }while(opcao2 < 2);

                    } else {
                        break;
                    }
            }

        }while(opcao < 2);

    }
}
