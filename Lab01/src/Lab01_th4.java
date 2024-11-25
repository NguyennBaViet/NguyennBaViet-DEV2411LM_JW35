import java.util.Scanner;

public class Lab01_th4 {
    public static void main(String[] args) {
       int n;
       float m;
       String str;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n: ");
       n = sc.nextInt();
       System.out.print("Enter m: ");
       m = sc.nextFloat();
       str = sc.nextLine();
       System.out.print("Enter str: ");
       str = sc.nextLine();
       System.out.print("Giá trị n vừa nhập: " +n);
       System.out.print("\nGiá trị m vừa nhập: " +m);
       System.out.print("\nGiá trị str vừa nhập: " +str);
    }
}
