package Practice;

import java.util.Scanner;

public class City {
    private String cityID;
    private String cityName;
    private String country;
    private double area;

    public City() {
    }
    public City(String cityID, String cityName, String country, double area) {
        this.cityID = cityID;
        this.cityName = cityName;
        this.country = country;
        this.area = area;
    }

    public String getCityID() {
        return cityID;
    }

    public void setCityID(String cityID) {
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the city ID: ");
        cityID = sc.nextLine();
        System.out.print("Enter the city name: ");
        cityName = sc.nextLine();
        System.out.print("Enter the country: ");
        country = sc.nextLine();
        System.out.print("Enter the area of the city: ");
        area = sc.nextDouble();
    }
    public void hienThi(){
        System.out.println("City ID: " + cityID);
        System.out.println("City Name: " + cityName);
        System.out.println("Country: " + country);
        System.out.println("Area: " + area);
    }

    @Override
    public String toString() {
        return "City{" +
                "cityID='" + cityID + '\'' +
                ", cityName='" + cityName + '\'' +
                ", country='" + country + '\'' +
                ", area=" + area +
                '}';
    }
}
