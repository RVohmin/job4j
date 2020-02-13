package ru.job4j.oop.profession;

public class Pacient {
    private String name;
    private String age;
    private String disease;
    private String gender;
    boolean isHealthy;

    public Pacient(String name, String age, String disease, String gender, boolean isHealthy) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.gender = gender;
        this.isHealthy = isHealthy;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public String getGender() {
        return gender;
    }
}
