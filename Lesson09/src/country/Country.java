package country;

import java.util.Scanner;

public class Country implements ICountry{
    private String countryName;
    double area;
    long numberPersons;

    public Country() {
    }

    public Country(String countryName, double area, long numberPersons) {
        this.countryName = countryName;
        this.area = area;
        this.numberPersons = numberPersons;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public long getNumberPersons() {
        return numberPersons;
    }

    public void setNumberPersons(long numberPersons) {
        this.numberPersons = numberPersons;
    }

    /**
     *
     */
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter country name: ");
        countryName = sc.nextLine();
        System.out.print("Enter area of persons: ");
        area = sc.nextDouble();
        System.out.print("Enter number of persons: ");
        numberPersons = sc.nextLong();
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("Country Name: " + countryName);
        System.out.println("Area of persons: " + area);
        System.out.println("Number of persons: " + numberPersons);
    }

    /**
     * @param area
     * @param numberPerson
     * @return
     */
    @Override
    public float everageArea(double area, long numberPerson) {
        return (float) area / numberPerson;
    }
}
