package org.example;

import org.example.student.Student;
import org.example.classroom.Classroom;

import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
    private static Classroom s = new Classroom();

    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 6) {
            try {
                switch (opcao) {
                    case 1:
                        registerStudent();
                        break;
                    case 2:
                        listStudents();
                        break;
                    case 3:

                      //  break;
                    case 4:

                       // break;
                    case 5:

                       // break;
                }

            } catch (Exception e) {
                System.out.println("ss");
            }
            opcao = exibirMenu();
        }
    }
    private static int exibirMenu () {
        System.out.println("""
                    BEM-VINDO, SELECIONE UMA OPÇÃO:
                    1 - Matricular um aluno
                    2 - Listar alunos
                    3 - Encerrar matrícula de um aluno
                    4 - Cadastrar nota de um aluno
                    5 - Listar notas
                    6 - Sair
                    """);
        return keyboard.nextInt();
    }
    private static void listStudents () {
        System.out.println("Contas cadastradas:");
        var list = s.listarAlunos();
        list.forEach(System.out::println);

        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
        keyboard.next();

    }
    private static void registerStudent () {

        System.out.println("Digite o nome do estudante:");
        var name = keyboard.next();

        System.out.println("Digite a idade:");
        var age = keyboard.nextInt();

        s.matricula(new Student(name, age));

        System.out.println("Aluno cadastrado");
        keyboard.next();
    }
}
