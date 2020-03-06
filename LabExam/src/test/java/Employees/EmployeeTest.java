/*
* Test Code for Employee.java
* Author: Thomas Martin G00339428
* Date: 06/03/2020
* Email: G00339428@gmit.ie
* */

package Employees;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @BeforeAll
    static void start(){
        System.out.println("Starting Tests");
    }

    @Test
    @DisplayName("Testing a valid constructor")
    void testGoodConstructor(){
        Employee employee = new Employee("Mr","Frank Grimes","abcdef","8451443","Full-time",18);
        assertEquals(Employee.class, employee.getClass());
    }
    @Test
    @DisplayName("Testing response from too long name in constructor")
    void testNameTooLongConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Fran","abcdef","8451443","Full-time",18));
    }
    @Test
    @DisplayName("Testing response from too short name in constructor")
    void testNameTooShortConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Frank 'grimey' grimes junior","abcdef","8451443","Full-time",18));
    }
    @Test
    @DisplayName("Testing response from bad PPS in constructor")
    void testBadPPSConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Frank Grimes","abcdefg","8451443","Full-time",18));
    }
    @Test
    @DisplayName("Testing response from bad phone in constructor")
    void testBadPhoneConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Frank Grimes","abcdef","451443","Full-time",18));
    }
    @Test
    @DisplayName("Testing response from Employment type age in constructor")
    void testBadEmploymentTypeConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Frank Grimes","abcdef","8451443","Employed",18));
    }
    @Test
    @DisplayName("Testing response from bad age in constructor")
    void testBadAgeConstructor(){
        assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","Frank Grimes","abcdef","8451443","Full-time",17));
    }
}
