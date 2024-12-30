package motor.yamaha;

import motor.Motor;

import java.util.Scanner;

public class Serius extends Motor {
    int warranty;

    public Serius() {
    }

    public Serius(String code, String name, Double capacity, int num, int warranty) {
        super(code, name, capacity, num);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    /**
     *
     */
    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter warranty: ");
        warranty = sc.nextInt();
    }

    /**
     *
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warranty);
    }
}
