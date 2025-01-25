package Bai4;

import java.util.Date;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String phoneNumber, String emailAddress, String department, double salary, Date dateHired, String title) {
        super(name, phoneNumber, emailAddress, department, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double CalculateBonus() {
        return 0.06 * getSalary();
    }

    @Override
    public int CalculateVacation() {
        Date now = new Date();
        long diffInMillis = now.getTime() - getDateHired().getTime();
        long years = diffInMillis / (1000L * 60 * 60 * 24 * 365);

        return years >= 5 ? 4 : 3;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + getName() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Nguyen Van A", "0123456789", "vanA@example.com");
        Student student = new Student("Tran Thi B", "0987654321", "thiB@example.com", "Computer Science");
        Faculty faculty = new Faculty("Le Van C", "0112233445", "vanC@example.com", "IT", 2000, new Date(119, 0, 1), "10AM - 12PM", "Senior Lecturer");
        Staff staff = new Staff("Hoang Thi D", "0223344556", "thiD@example.com", "HR", 1500, new Date(115, 0, 1), "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(faculty);
        System.out.println("Faculty Bonus: " + faculty.CalculateBonus());
        System.out.println("Faculty Vacation: " + faculty.CalculateVacation() + " weeks");
        System.out.println(staff);
        System.out.println("Staff Bonus: " + staff.CalculateBonus());
        System.out.println("Staff Vacation: " + staff.CalculateVacation() + " weeks");
    }
}

