package PRACTICE.vehicle;

import java.util.Scanner;

public class Vehicle implements IVehicle {
    private String make;
    private String model;
    private double price;

    public Vehicle() {

    }

    public Vehicle(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    /**
     *
     */
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Make: ");
        make = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }
    public String getModel(){
        return model;
    }
}

