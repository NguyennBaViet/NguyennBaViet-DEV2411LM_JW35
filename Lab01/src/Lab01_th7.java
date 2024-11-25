import java.util.Scanner;

public class Lab01_th7 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = sc.nextInt();
        System.out.println("Enter y: ");
        y = sc.nextInt();

        int max = Math.max(x, y);
        System.out.println("Giá trị max là: " +max);

        int min = Math.min(x, y);
        System.out.println("Giá trị min là: " +min);
    }
}
