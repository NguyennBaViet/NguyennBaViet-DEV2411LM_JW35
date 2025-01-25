package Bai4;

import java.util.Date;

public abstract class Employee extends Person {
    private String department;
    private double salary;
    private Date dateHired;

    public Employee(String name, String phoneNumber, String emailAddress, String department, double salary, Date dateHired) {
        super(name, phoneNumber, emailAddress);
        this.department = department;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public abstract double CalculateBonus();

    public abstract int CalculateVacation();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }
}

