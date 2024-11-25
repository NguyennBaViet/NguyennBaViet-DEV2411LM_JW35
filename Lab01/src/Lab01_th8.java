import java.util.Scanner;

public class Lab01_th8 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = sc.nextInt();
        System.out.println("Enter y: ");
        y = sc.nextInt();
        System.out.println("Enter z: ");
        z = sc.nextInt();

        int max = Math.max(x, Math.max(y, z));
        System.out.println("Giá trị max là: "+max);

        int min = Math.min(x, Math.min(y, z));
        System.out.println("Giá trị min là: "+min);
    }
}
