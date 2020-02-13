package ru.job4j.oop.profession;

public class Doctor extends Profession {
    String treatmentCount;

    public String getTreatmentCount() {
        return treatmentCount;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Health diagnose(Pacient pacient) {
        return new Health("temperature", "pressure", "complaints", "mood");
    }
}
