package java8course.src.test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java8course.src.main.java.Gender;
import java8course.src.main.java.Person;


public class PersonTest {

    @Test
    public void toStringTest() {
        final Person person = new Person("Michael", Gender.MALE, 50);
        assertEquals("Michael -- MALE -- 50", person.toString());
    }
    
}