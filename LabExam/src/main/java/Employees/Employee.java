/*
 * Author: Thomas Martin G00339428
 * Date: 06/03/2020
 * Email: G00339428@gmit.ie
 * */
package Employees;

/*
* employee Class takes a title, name, pps, phone, employment-status and Age
* All these are needed to create a valid instance of Employee
* Fail to provide correct details for any field and an appropriate exception is thrown
 */
public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String phoneNumber;
    private String employmentType;
    private int age;

    public Employee(String title, String name, String PPS, String phoneNumber, String employmentType, int age) {
        if(name.length() < 5){
            throw new IllegalArgumentException("Name too short");
        }
        if(name.length() > 22){
            throw new IllegalArgumentException("Name too long");
        }
        if(PPS.length() != 6){
            throw new IllegalArgumentException("Invalid PPS");
        }
        if(phoneNumber.length() != 7 ){
            throw new IllegalArgumentException("Invalid Phone Number");
        }
        if(!employmentType.equalsIgnoreCase("Full-time")){
           if(!employmentType.equalsIgnoreCase("Part-time")) {
               throw new IllegalArgumentException("Invalid Employment Type");
           }
        }
        if(age < 18){
            throw new IllegalArgumentException("You are too young");
        }

        this.title = title;
        this.name = name;
        this.PPS = PPS;
        this.phoneNumber = phoneNumber;
        this.employmentType = employmentType;
        this.age = age;
    }
}
