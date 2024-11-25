import java.util.Scanner;

public class Lab01_th6 {
    public static void main(String[] args) {
        int n1,m1;
        double n2,m2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        n2 = sc.nextInt();
        System.out.print("Enter m1: ");
        m1 = sc.nextInt();
        System.out.print("Enter m2: ");
        m2 = sc.nextInt();
        double tongN1N2 = n1+n2;
        System.out.println("Tổng 2 số nguyên là: " +(n1+m1));
        System.out.println(("Tổng 2 số thực là: ") +(n2+m2));
        System.out.println(("Tổng của n1 và n2 là: ") +tongN1N2);
    }
}
