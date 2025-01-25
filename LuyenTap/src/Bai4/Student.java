package Bai4;

public class Student extends Person {
    private String program;

    public Student(String name, String phoneNumber, String emailAddress, String program) {
        super(name, phoneNumber, emailAddress);
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}

