import java.util.Scanner;

public class Lab03_th2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Enter n : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
            System.out.print(" " +sum);
    }
}
