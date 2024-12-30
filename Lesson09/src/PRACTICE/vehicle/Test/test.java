package PRACTICE.vehicle.Test;

import PRACTICE.vehicle.Car.Car;
import PRACTICE.vehicle.Truck.Truck;
import PRACTICE.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class test extends Vehicle{
    List<Vehicle> vehicles = new ArrayList<Vehicle>();
    public int showMenu(){
        System.out.println("======MENU======");
        System.out.println("1.Input");
        System.out.println("2.Output");
        System.out.println("3.Sort by price");
        System.out.println("4.Search by model");
        System.out.println("5.Exit");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("NHẬP THÔNG TIN CAR: ");
        for(int i = 0; i < 3; i++){
            System.out.println("CAR THỨ "+(i+1));
            car.input();
            vehicles.add(car);
        }

        Truck truck = new Truck();
        System.out.println("NHẬP THÔNG TIN TRUCK: ");
        for(int i = 0; i < 3; i++){
            System.out.println("TRUCK THỨ "+(i+1));
        truck.input();
        vehicles.add(truck);
        }
    }
    public void display(){
        for (Vehicle v : vehicles) {
            v.display();
        }
    }
    public void sapXep(){
        System.out.println("Chưa sắp xếp ");
        for (Vehicle v : vehicles) {
            System.out.println(vehicles.toString());
        }
        System.out.println("Sắp xếp theo giá ");
       Collections.sort(vehicles,(x,y)->{
          if(x.getPrice() > y.getPrice())
              return 1;
          else if(x.getPrice() < y.getPrice())
              return -1;
          return 0;
       });
    }
    public void timKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập model muốn tìm: ");
        String keyword = sc.nextLine();
        AtomicBoolean found = new AtomicBoolean(false);
        vehicles.forEach(vehicle->{
            if(vehicle.getModel().toLowerCase().contains(keyword.toLowerCase())){
                vehicle.display();
                found.set(true);
            }
        });
        if(!found.get()){
            System.out.println("Khong tim thay model");
        }
    }

    public static void main(String[] args) {
        test test = new test();
        int chon = 0;
        do {
            chon = test.showMenu();
            switch (chon) {
                case 1:
                    test.input();
                    break;
                case 2:
                    test.display();
                    break;
                case 3:
                    test.sapXep();
                    break;
                case 4:
                    test.timKiem();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập từ 1 -> 5");
                    break;
            }
        }while (chon != 5);
    }
}
