package PRACTICE.vehicle.Truck;

import PRACTICE.vehicle.Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
    private int truckLoad;

    /**
     *
     */
    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter truck load: ");
        truckLoad = sc.nextInt();
    }

    /**
     *
     */
    @Override
    public void display() {
        super.display();
        System.out.println("Truck load: " + truckLoad);
    }

    @Override
    public String toString() {
        String truck = super.toString() + ", Truck load: " + truckLoad;
        return truck;
    }
}
