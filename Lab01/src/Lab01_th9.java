import java.util.Scanner;

public class Lab01_th9 {
    public static void main(String[] args) {
        float a,b;
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextFloat();
        System.out.print("Enter b: ");
        b = sc.nextFloat();
        // Giai phuong trinh
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }else {
                System.out.println("Phương trình vô ngiệm");
            }
        }else{
            x=-b/a;
            System.out.println("Nghiệm x="+x);
        }
    }
}
