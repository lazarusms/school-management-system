package org.example;

import org.example.classRoom.ClassRoom;

import java.util.Scanner;

public class Main {
    private static final Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
    private static final ClassRoom classRoom = new ClassRoom();

    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 6) {
            try {
                switch (opcao) {
                    case 1 -> classRoom.register();
                    case 2 -> classRoom.listStudents();
                    case 3 -> classRoom.remove();
                    case 4 -> classRoom.insertGrade();
                    // case 5 -> list();
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


}
