package org.example.model;

public class Student {
    private final StudentData studentdata;
    private static int c = 0;
    private final int id;
    private int grade;

    public Student(StudentData data){
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
                ", Media = " + getGrade() +
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
