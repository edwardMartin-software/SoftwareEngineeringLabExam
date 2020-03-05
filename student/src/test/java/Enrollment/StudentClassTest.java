package Enrollment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class StudentClassTest {
    Student student;

    @BeforeAll
    static void init(){
        System.out.println("Starting Tests...");
    }

    @Test
    @DisplayName("Testing No Name")
    void testConstructorNoName(){
//        student = new Student("", "pj@gmail.com");
        assertThrows(IllegalArgumentException.class, () -> new Student("", "pj@gmail.com") );

    }
    @Test
    @DisplayName("Testing No Email")
    void testConstructorNoEmail(){
//        student = new Student("Paul", "");
        assertThrows(IllegalArgumentException.class, () -> new Student("Paul", "") );

    }

    @Test
    @DisplayName("Testing true Constructor")
    void testConstructor(){
        student = new Student("Paul", "paul@gmit.ie");
        assertEquals(Student.class, student.getClass());

    }

    @AfterAll
    static void finish(){
        System.out.println("Testing is finished!");
    }
}
