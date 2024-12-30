package PRACTICE.vehicle.Car;

import PRACTICE.vehicle.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    private String color;

    /**
     *
     */
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = sc.nextLine();
    }

    /**
     *
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Color: " + color);
    }

    @Override
    public String toString() {
        String car = super.toString() + ", Color: " + color;
        return car;
    }
}
