package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov Ivan Ivanovich");
        student.setGroup(15);
        student.setAdmission(new Date());

        System.out.println("Student " + student.getName() + ", in group " + student.getGroup() + ", from " + student.getAdmission());
    }
}
