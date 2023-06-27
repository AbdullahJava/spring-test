package com.spring.springtest.junit;

import org.junit.jupiter.api.*;

class StudentTest {

    private Student student;



    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll..........");
    }

    @BeforeEach
    void setUp() {
        student = new Student();
        System.out.println("@BeforeEach..........");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll................");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach................");
    }

    @Test
    void getName() {
        System.out.println(student.getName());
    }

    @Test
    void getAge() {
        System.out.println(student.getAge());
    }
}