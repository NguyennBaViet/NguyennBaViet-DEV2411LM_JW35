import java.util.Scanner;

public class Lab02_th5 {
    int n;
    void nhapN(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        n = sc.nextInt();
    }
    void kiemTraN(){
        if (n % 2 == 0) {
            System.out.println("N là số chẵn");
        } else {
            System.out.println("N là số lẻ");
        }
    }
    public static void main(String[] args) {
        Lab02_th5 l = new Lab02_th5();
        l.nhapN();
        l.kiemTraN();
    }
}
