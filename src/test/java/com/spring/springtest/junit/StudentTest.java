package com.spring.springtest.junit;

import org.junit.jupiter.api.*;

class StudentTest {

    @Test
    void findById() {
        System.out.println("Student 3333");
        Student student = new Student();
        Assertions.assertEquals(student.findById(5), "Eslam");
    }
}