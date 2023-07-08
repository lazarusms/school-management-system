package org.example.students;

import org.example.management.Subjects;

import java.util.*;

public class Student {
    private StudentData studentdata;
    private static int c = 0;
    private final int id;

    private Map<Subjects, Integer> grades;
    private int average;

    public Student(StudentData data, Map<Subjects, Integer> grades){
        this.studentdata = data;
        this.grades = grades;
        this.id = ++c;
    }
    public Student(StudentData data){
        this.studentdata = data;
        this.grades = new HashMap<>();
        this.id = ++c;
    }

    public Student() {
        this.id = getId();
    }

    public Integer calcAverage() {
        int sum = 0;
        if (grades != null) {
            for (Integer grade : grades.values()) {
                sum += grade;
            }
            if (grades.size() > 0) {
                average = sum / grades.size();
            } else {
                average = 0;
            }
        } else {
            average = 0;
        }
        return average;
    }

    public void setGrades(Map<Subjects, Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(Subjects subject, int grade){
       grades.put(subject, grade);
    }
    public void listGrades(){
        for(int grade : grades.values()){
            System.out.println(grade);
        }
    }

    @Override
    public String toString() {

        return "Aluno: [" +
                "Nome = " + studentdata.name() + " " +
                ", Número da chamada = " + getId() +
                ", Idade = " + studentdata.age() +
                ", Telefone = " + studentdata.telefone() +
                ", CPF = " + studentdata.cpf() +
                ", Média = " + calcAverage() +
                ", Endereco = " + studentdata.endereco().getBairro() +
                ']';
    }

    public int getId() {
        return id;
    }

    public Map<Subjects, Integer> getGrades() {
        return grades;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }
}
