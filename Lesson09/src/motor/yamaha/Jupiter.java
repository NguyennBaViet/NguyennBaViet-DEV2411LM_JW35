package motor.yamaha;

import motor.Motor;

import java.util.Scanner;

public class Jupiter extends Motor {
    int warranty; // bao hanh
    public Jupiter() {
        super();
    }

    public Jupiter(String code, String name, Double capacity, int num, int warranty) {
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
        System.out.print("Enter Warranty Number: ");
        warranty = sc.nextInt();
    }

    /**
     *
     */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty Number: " + warranty);
    }

}
