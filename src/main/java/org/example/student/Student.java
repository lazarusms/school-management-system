package org.example.student;

public class Student {
    private String name;
    private int age;
    private static int c = 0;
    private int id;

    private int grade;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.id = ++c;
    }
    @Override
    public String toString() {

        return "Aluno: [" +
                "Nome = " + name + " " +
                ", Número da chamada = " + id +
                ", Idade = " + age +
                ", Nota = " + grade +
                ']';
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }


    public int getIdade() {
        return age;
    }

    public void setIdade(int idade) {
        this.age = idade;
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
