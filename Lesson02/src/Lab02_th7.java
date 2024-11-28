import java.util.Scanner;

public class Lab02_th7 {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        System.out.println("Enter d: ");
        d = sc.nextInt();

        int max = Math.max(a,Math.max(b,c));
        max = Math.max(max,d);
        System.out.println("Giá trị lớn nhất là : "+max);
    }
}
