package org.example.student;

import org.example.model.Endereco;
import org.example.model.StudentDataBase;

public class Student {
    private StudentDataBase studentdata;
    private static int c = 0;
    private int id;
    private int grade;

    public Student(StudentDataBase data){
        this.studentdata = data;
        this.id = ++c;
    }
    @Override
    public String toString() {

        return "Aluno: [" +
                "Nome = " + studentdata.name() + " " +
                ", Número da chamada = " + getId() +
                ", Idade = " + studentdata.age() +
                ", Telefone = " + studentdata.telefone() +
                ", CPF = " + studentdata.cpf() +
                ", Nota = " + getGrade() +
                ", Endereco = " + studentdata.endereco().getBairro() +
                ']';
    }

    public int getId() {
        return id;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
