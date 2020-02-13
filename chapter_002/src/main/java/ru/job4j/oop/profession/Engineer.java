package ru.job4j.oop.profession;

public class Engineer extends Profession {
    String mathSkill;

    public String getMathSkill() {
        return mathSkill;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Project disign(Task task) {
        return new Project("hard", "huge");
    }
}
