package com.knoldus.springWebflux.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Person#Person()}
     *   <li>{@link Person#setAge(int)}
     *   <li>{@link Person#setFirstName(String)}
     *   <li>{@link Person#setId(Integer)}
     *   <li>{@link Person#setLastName(String)}
     *   <li>{@link Person#toString()}
     *   <li>{@link Person#getAge()}
     *   <li>{@link Person#getFirstName()}
     *   <li>{@link Person#getId()}
     *   <li>{@link Person#getLastName()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Person actualPerson = new Person();
        actualPerson.setAge(1);
        actualPerson.setFirstName("Jane");
        actualPerson.setId(1);
        actualPerson.setLastName("Doe");
        String actualToStringResult = actualPerson.toString();
        assertEquals(1, actualPerson.getAge());
        assertEquals("Jane", actualPerson.getFirstName());
        assertEquals(1, actualPerson.getId().intValue());
        assertEquals("Doe", actualPerson.getLastName());
        assertEquals("Person(id=1, firstName=Jane, lastName=Doe, age=1)", actualToStringResult);
    }

    /**
     * Methods under test:
     */
    @Test
    void testConstructor2() {
        Person actualPerson = new Person(11, "Deepak", "Kumar", 19);
        actualPerson.setAge(19);
        actualPerson.setFirstName("Deepak");
        actualPerson.setId(11);
        actualPerson.setLastName("Kumar");
        String actualToStringResult = actualPerson.toString();
        assertEquals(19, actualPerson.getAge());
        assertEquals("Deepak", actualPerson.getFirstName());
        assertEquals(11, actualPerson.getId().intValue());
        assertEquals("Kumar", actualPerson.getLastName());
        assertEquals("Person(id=11, firstName=Deepak, lastName=Kumar, age=19)", actualToStringResult);
    }
}

