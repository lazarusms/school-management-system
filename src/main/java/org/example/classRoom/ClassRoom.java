package org.example.classRoom;

import org.example.model.Student;
import org.example.model.StudentData;
import org.example.service.CepService;
import org.example.subjects.Subjects;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ClassRoom implements  ClassRoomInterface{
    private final Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
    private final CepService c = new CepService();
    private final Set<Student> students = new LinkedHashSet<>();

    public Set<Student> listStudents() {
        System.out.println(students);
        return students;
    }

    public void register(){
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

        Student student = new Student(new StudentData(name, cpf, age, c.abEndereco(cep), telefone));
        System.out.println("Aluno cadastrado");
        keyboard.next();
        students.add(student);
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
        System.out.println("Digite o id do estudante que deseja adicionar uma nota:");
        var id = keyboard.nextInt();
        var stud = findStudent(id);
        System.out.println("Qual a matéria? :");
        var subjectStr = keyboard.next();
        System.out.println("Qual a nota?");
        var grade = keyboard.nextInt();

        try {
            Subjects subject = Subjects.valueOf(subjectStr);
            if (stud != null) {
               subject.setGrade(grade);
               Subjects.listGrades();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Matéria inválida!");
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

