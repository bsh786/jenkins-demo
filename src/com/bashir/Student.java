package com.bashir;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(name+" : Hello everyone");
    }
}
