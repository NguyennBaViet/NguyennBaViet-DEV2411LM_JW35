package Bai4;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String phoneNumber, String emailAddress, String department, double salary, Date dateHired, String officeHours, String rank) {
        super(name, phoneNumber, emailAddress, department, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public double CalculateBonus() {
        return 1000 + 0.05 * getSalary();
    }

    @Override
    public int CalculateVacation() {
        Date now = new Date();
        long diffInMillis = now.getTime() - getDateHired().getTime();
        long years = diffInMillis / (1000L * 60 * 60 * 24 * 365);

        int vacation = years > 3 ? 5 : 4;
        if ("Senior Lecturer".equals(rank)) {
            vacation += 1;
        }

        return vacation;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + getName() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}

