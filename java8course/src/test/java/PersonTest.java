package java8course.src.test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java8course.src.main.java.Person;


public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {
        final Person michael = new Person();
        assertEquals("Hello World", michael.helloWorld());
    }
    
}