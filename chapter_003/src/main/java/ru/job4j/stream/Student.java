package ru.job4j.stream;

public class Student {
    int score;

    public Student(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "student score : " + score;
    }
}
