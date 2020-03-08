package ru.job4j.stream;

public class Student implements Comparable<Student> {
    private int score;
    private String surname;

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return o.getScore() - this.getScore();
    }
    @Override
    public String toString() {
        return "Surname: " + surname + " score: " + score;
    }
}
