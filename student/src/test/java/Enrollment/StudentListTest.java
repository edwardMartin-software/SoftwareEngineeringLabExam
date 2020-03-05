package Enrollment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class StudentListTest {
    StudentList studentList;
    Student student;

    @BeforeAll
    static void init(){
        System.out.println("Starting Tests...");
    }

    @BeforeEach
    void create(){
        studentList = new StudentList();
        student = new Student("Cillin", "cillinp3@gmail.com");
    }

    @Test
    @DisplayName("Test adding to StudentList")
    void testAddStudent(){
        studentList.addStudent(student);
    }


    @Test
    @DisplayName("Find by name")
    void testFindByname(){
        studentList.addStudent(student);
        Student returnedStudent = studentList.findByName("Cillin");
        assertEquals(student, returnedStudent.getStudent());

    }
    @Test
    @DisplayName("Find by name non-existant")
    void testFindBynameNotThere(){

        Student returnedStudent = studentList.findByName("Bob");
        assertNull(returnedStudent);

    }

    @Test
    void testSize(){
        studentList.addStudent(student);
        assertEquals(1,studentList.getSize());
    }

    @AfterAll
    static void finish(){
        System.out.println("Testing is finished!");
    }
}
