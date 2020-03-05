package Enrollment;

public class Student {
    private String name;
    private String email;

    public Student(String name, String email) {

        if(name.equalsIgnoreCase("")|| email.equalsIgnoreCase("")){
            throw new IllegalArgumentException("You cant do that");
        }
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Student getStudent(){
        return this;
    }
}
