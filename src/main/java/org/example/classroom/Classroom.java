package org.example.classroom;

import org.example.student.Student;

import java.util.HashSet;
import java.util.Set;

public class Classroom {

    private Set<Student> students = new HashSet<>();

    public Set<Student> listarAlunos() {
        return students;
    }
    public void matricula(Student student){
        var alunx = new Student(student.getNome(), student.getIdade());
        students.add(alunx);
    }

}
