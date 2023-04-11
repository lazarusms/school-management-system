package org.example.student;

public class Student {
    private String name;
    private int age;
    private final int id;
    private static int i = 0;


    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.id = i++;
    }
    @Override
    public String toString() {
        return "Conta{" +
                "Nome='" + name + '\'' +
                ", Idade=" + age +
                ", Número da chamada=" + id +
                '}';
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
}
