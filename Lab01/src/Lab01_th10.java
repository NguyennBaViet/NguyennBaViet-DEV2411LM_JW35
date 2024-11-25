import java.util.Scanner;

public class Lab01_th10 {
    public static void main(String[] args) {
        float a,b,c;
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextFloat();
        System.out.print("Enter b: ");
        b = sc.nextFloat();
        System.out.print("Enter c: ");
        c = sc.nextFloat();

        float delta = b*b - 4*a*c;
        if (delta > 0) {
            float x1 = (float) ((-b +Math.sqrt(delta)) / (2*a));
            float x2 = (float) ((-b -Math.sqrt(delta)) / (2*a));
            System.out.print("Phương trình có 2 nghiệm phân biệt ");
            System.out.println("x1: " +x1);
            System.out.println("x2: " +x2);
        } else if (delta == 0) {
            x = -b/ (2*a);
            System.out.print("Phương trình có nghiệm kép");
            System.out.println("x: " +x);
        }
        else{
            System.out.print("Phương trình vô nghiệm");
        }
    }
}
