import java.util.Scanner;

public class Lab01_bth2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Devmaster");

        //lớp Scanner
        Scanner input = new Scanner(System.in);
        //Khai báo biến
        String tenCuaBan;
        System.out.println("Nhập tên của bạn: ");
        //Nhập dữ liệu từ bàn phím
        tenCuaBan = input.nextLine();
        //Hiển thị dữ liệu từ biến
        System.out.println("Tên của bạn "+tenCuaBan);
    }
}
