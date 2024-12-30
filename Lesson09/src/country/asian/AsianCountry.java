package country.asian;

import country.Country;

import java.util.Scanner;

public class AsianCountry extends Country {
    private String location;

    public AsianCountry() {
        super();
    }

    public AsianCountry(String countryName, double area, long numberPersons, String location) {
        super(countryName, area, numberPersons);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     */
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter location: ");
        String location = sc.nextLine();
    }

    /**
     *
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Location: " + location);
    }
}
