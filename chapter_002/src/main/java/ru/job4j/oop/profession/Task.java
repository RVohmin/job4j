package ru.job4j.oop.profession;

public class Task {
    int volumeTime;
    int complexityHours;

    public Task(int volumeTime, int complexityHours) {
        this.volumeTime = volumeTime;
        this.complexityHours = complexityHours;
    }

    public int getVolumeTime() {
        return volumeTime;
    }

    public int getComplexityHours() {
        return complexityHours;
    }
}
