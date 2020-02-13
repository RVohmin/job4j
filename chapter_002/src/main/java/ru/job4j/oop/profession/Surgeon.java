package ru.job4j.oop.profession;

import ru.job4j.oop.profession.Doctor;

public class Surgeon extends Doctor {
    String successOperations;

    public String getSuccessOperations() {
        return successOperations;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public boolean doOperation() {
        return true;
    }
}
