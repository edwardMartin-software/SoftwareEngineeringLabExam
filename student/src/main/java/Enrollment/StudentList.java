package Enrollment;

import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student student){
        studentList.add(student);
    }

    public Student findByName(String name){
        for (Student student : studentList ) {
            if (student.getName().equalsIgnoreCase(name)){
                return student;
            }
        }
        return null;

    }
    public int getSize(){
        return studentList.size();
    }
}
