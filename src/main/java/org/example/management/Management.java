package org.example.management;

import org.example.students.Student;
import org.example.students.StudentData;
import org.example.service.CepService;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Management {
    private final Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
    private final CepService c = new CepService();
    private Set<Student> students;
    private Student student;

    public Management() {
        students = new LinkedHashSet<>();
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("Não há alunos cadastrados.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void register() {
        System.out.println("Digite o nome do estudante:");
        var name = keyboard.next();

        System.out.println("Digite a idade:");
        var age = keyboard.nextInt();

        System.out.println("Digite o cpf:");
        var cpf = keyboard.next();

        System.out.println("Digite o CEP do aluno:");
        var cep = keyboard.next();

        System.out.println("Digite o telefone:");
        var telefone = keyboard.next();

        var endereco = c.abEndereco(cep); // Obter o endereço com base no CEP

        Student student = new Student(new StudentData(name, cpf, age, endereco, telefone));
        students.add(student);
        System.out.println("Aluno cadastrado");
    }


    public void remove(){
        System.out.println("Digite o id do estudante que deseja remover:");
        var id = keyboard.nextInt();
        var stud = findStudent(id);
        if (stud != null) {
            students.remove(stud);
            System.out.println("Usuario removido");

        }
    }
    public void insertGrade() {
        Subjects subjects = null;
        System.out.println("Digite o id do estudante que deseja adicionar uma nota:");
        var id = keyboard.nextInt();
        var stud = findStudent(id);
        System.out.println("""
                    Escolha o n° da matéria:\s
                    ------------------------------------------------------
                    1 - Português
                    2 - Inglês
                    3 - Matemática
                    ------------------------------------------------------
                    """);
        var subjectStr = keyboard.nextInt();
        System.out.println("Qual a nota?");
        var grades = keyboard.nextInt();

        switch(subjectStr){
            case 1 -> subjects = Subjects.PORTUGUES;
            case 2 -> subjects = Subjects.INGLES;
            case 3 -> subjects = Subjects.MATEMATICA;
        }
        if (stud != null && subjects != null) {
            student.addGrade(subjects, grades);
            System.out.println("Nota adicionada com sucesso!");
            }
            else {
                System.out.println("Estudante ou matéria não encontrada");
            }
    }

    public void listGrades(){
        System.out.println("Digite o id do estudante que deseja ver as notas:");
        var id = keyboard.nextInt();
        var stud = findStudent(id);
        if(stud != null){
            try{
                student.listGrades();
            }
            catch (Exception e){
                System.out.println("Não há notas");
            }

        }
    }
    public Student findStudent(Integer id) {
        for(Student s : students){
            if(s.getId() == id){
                return s;
            }
    }
        return null;
    }
}

