package ru.job4j.oop.profession;

public class Builder extends Engineer {
    String buildings;

    public Builder(String buildings) {
        this.buildings = buildings;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getBuildings() {
        return buildings;
    }

    public boolean buildHouse() {
        return true;
    }
}
