package com.spring.springtest.junit;

public class Student {

    private static String name = "Abdallha";
    private static String age = "21";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Student.name = name;
    }

    public String  getAge() {
        return age;
    }

    public void setAge(String  age) {
        Student.age = age;
    }
}