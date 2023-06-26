package org.example.classRoom;

import org.example.model.Student;
import java.util.LinkedHashSet;
import java.util.Set;


    public interface ClassRoomInterface {
        Set<Student> students = new LinkedHashSet<>();
        void register();
        void remove();
        void insertGrade();
        Student findStudent(Integer id);
    }

