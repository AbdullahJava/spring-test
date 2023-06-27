package com.spring.springtest.junit;

public class Student {

    private static String name = "Abdallha";
    private static int age = 24;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Student.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Student.age = age;
    }
}