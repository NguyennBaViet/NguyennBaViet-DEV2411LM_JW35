package motor;

import java.util.Scanner;

public class Motor implements IMotor{
    String code;
    String name;
    Double capacity;
    int num;

    public Motor() {
    }
    public Motor(String code, String name, Double capacity, int num) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     *
     */
    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        code = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter capacity: ");
        capacity = sc.nextDouble();
        System.out.print("Enter num: ");
        num = sc.nextInt();
    }

    /**
     *
     */
    @Override
    public void displayInfo() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Num: " + num);
    }

    /**
     *
     */
    @Override
    public void changeInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code new: ");
        code = sc.nextLine();
        System.out.print("Enter name new: ");
        name = sc.nextLine();
        System.out.print("Enter capacity new: ");
        capacity = sc.nextDouble();
        System.out.print("Enter num new: ");
        num = sc.nextInt();
    }
}
