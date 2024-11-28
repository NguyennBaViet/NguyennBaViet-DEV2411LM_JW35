import java.util.Scanner;

public class Lab02_th1 {
    private String name;
    private String address;
    private Double salary;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your address: ");
        address = sc.nextLine();
        System.out.print("Enter your salary: ");
        salary = sc.nextDouble();
    }
    void view(){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
    public static void main(String[] args) {
        Lab02_th1 obj = new Lab02_th1();
        obj.input();
        obj.view();
    }
}
