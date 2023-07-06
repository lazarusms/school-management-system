package org.example;

import org.example.management.Management;
import org.example.students.Student;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
    private static final Management management = new Management();

    public static void main(String[] args) {
        var opcao = exibirMenu();
        while (opcao != 6) {
            try {
                switch (opcao) {
                    case 1 -> management.register();
                    case 2 -> management.listStudents();
                    case 3 -> management.remove();
                    case 4 -> management.insertGrade();
                    case 5 -> management.listGrades();
                }
            } catch (NullPointerException e) {
            System.out.println("O conjunto de alunos não está inicializado corretamente.");
            e.printStackTrace();
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
