package com.michaeltran.java8course;

import org.junit.Test;
import org.junit.Assert.assertEquals;


public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        final Person michael = new Person();
        assertEquals("Hello World", michael.helloWorld());
    }
    
}