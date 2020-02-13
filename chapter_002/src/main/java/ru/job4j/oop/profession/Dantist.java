package ru.job4j.oop.profession;

public class Dantist extends Doctor {
    String pullTooths;

    public String getPullTooths() {
        return pullTooths;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public boolean treatTooth(Pacient pacient) {
        return true;
    }
}
