package org.example.subjects;

public enum Subjects {
    PORTUGUES(0),
    INGLES(0),
    MATEMATICA(0);

    private int grade;

    Subjects(int nota) {}

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void listGrades() {
        for (Subjects subject : Subjects.values()) {
            System.out.println(subject.name() + " = " + subject.getGrade());
        }
    }
}
