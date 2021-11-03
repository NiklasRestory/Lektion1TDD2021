package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void IsLeapYear1992() {
        assertTrue(Main.isLeapYear(1992));
    }

    @Test
    public void IsNotALeapYear1995() {
        assertFalse(Main.isLeapYear(1995));
    }

    @Test
    public void IsNotALeapYear1900() {
        assertFalse(Main.isLeapYear(1900));
    }

    @Test
    public void IsALeapYear2000() {
        assertTrue(Main.isLeapYear(2000));
    }

    @Test
    public void add3And6InPerson() {
        Person person = new Person();

        int five = 5;
        five += 54;

        assertEquals(9, person.add(3, 6));
    }

    @Test
    public void PersonExists() {
        Person person = new Person();

        assertNotNull(person);
    }
}