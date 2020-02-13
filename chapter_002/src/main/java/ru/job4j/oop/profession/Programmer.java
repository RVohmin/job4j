package ru.job4j.oop.profession;

public class Programmer extends Engineer {
    String basicLang;

    public Programmer(String basicLang) {
        this.basicLang = basicLang;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getBasicLang() {
        return basicLang;
    }

    public void code() {
    }
}
