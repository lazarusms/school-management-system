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
                       removeStudent();
                       break;
                    case 4:
                       insertSchoolGrade();
                       break;
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
                    ------------------------------------------------------
                    BEM-VINDO, SELECIONE UMA OPÇÃO:
                    ------------------------------------------------------
                    1 - Matricular um aluno
                    2 - Listar alunos
                    3 - Encerrar matrícula de um aluno
                    4 - Cadastrar nota de um aluno
                    5 - Listar notas
                    6 - Sair
                    ------------------------------------------------------
                    """);
        return keyboard.nextInt();
    }
    private static void listStudents () {
        System.out.println("Contas cadastradas:");
        var list = s.listStudents();
        list.forEach(System.out::println);

        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
        keyboard.next();

    }
    private static void registerStudent () {

        System.out.println("Digite o nome do estudante:");
        var name = keyboard.next();

        System.out.println("Digite a idade:");
        var age = keyboard.nextInt();

        s.register(new Student(name, age));

        System.out.println("Aluno cadastrado");
        keyboard.next();
    }
    private static void removeStudent(){
        System.out.println("Digite o id do estudante que deseja remover:");
        var id = keyboard.nextInt();
        s.remove(id);
        System.out.println("Usuario removido");
    }
    private static void insertSchoolGrade(){
        System.out.println("Digite o id do estudante que deseja adicionar uma nota:");
        var insert = keyboard.nextInt();
        System.out.println("Digite a nota:");
        var grade = keyboard.nextInt();
        s.insertGrade(insert, grade );

    }
}
