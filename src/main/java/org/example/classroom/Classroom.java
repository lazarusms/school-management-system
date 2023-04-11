package org.example.classroom;

import org.example.student.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Classroom {

    private Set<Student> students = new LinkedHashSet<>();

    public Set<Student> listStudents() {
        return students;
    }
    public void register(Student student){;
        students.add(student);
    }


    public void remove(Integer id) {
        var stud = findStudent(id);
        if (stud != null) {
            students.remove(stud);

        }
    }

    private Student findStudent(Integer id) {
        for(Student s : students){
            if(s.getId() == id){
                return s;
            }

    }
        return null;
    }}

