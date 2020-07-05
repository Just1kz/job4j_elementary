package ru.job4j.pojo;

import java.util.Date;

public class Сollege {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Belykh Anton Sergeevich");
        student.setGroup("№ 123");
        student.setCreated(new Date());
        System.out.println("FIO: " + student.getFio() + ", Group: " + student.getGroup() + ", date: " + student.getCreated());
    }
}
