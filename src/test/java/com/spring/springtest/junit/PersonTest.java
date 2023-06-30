package com.spring.springtest.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void personTest1() {
        System.out.println("11111");
    }


    @Test
    @Disabled
    void personTest() {
        System.out.println("22222");
        Person person = new Person();

        Assertions.assertAll("Person Data",
                () -> Assertions.assertAll
                        ("Person Names",
                                () -> Assertions.assertEquals(person.getFName(), "Eslamm", "F Name not Matches"),
                                () -> Assertions.assertEquals(person.getLName(), "Khder", "L Name  not Matches")
                        ),
                () -> Assertions.assertAll
                        ("Person Phones",
                                () -> Assertions.assertEquals(person.getPhone1(), "01113903660", "Phone not Matches"),
                                () -> Assertions.assertEquals(person.getPhone2(), "012555828555", "Phone  not Matches")
                        )
        );

    }
}
