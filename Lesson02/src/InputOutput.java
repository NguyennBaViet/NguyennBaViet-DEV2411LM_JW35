import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        //khai báo biến
        int a,b=100;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = sc.nextInt();

        int c=a+b;
        System.out.println("The sum is: " + c);
        System.out.printf("%d + %d = %d",a,b,c );

    }
}