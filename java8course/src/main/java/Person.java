package java8course.src.main.java;

public class Person {
    private final String name;
    private final Gender gender;
    private final int age;

    public Person(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age  = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String toString() {
        return String.format("%s  -- %s -- %d", name, gender, age);
    }

    public Gender getGender() {
        return gender;
    }
}
