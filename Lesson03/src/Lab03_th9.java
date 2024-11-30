import java.util.Scanner;

public class Lab03_th9 {
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            System.out.println("Cuối tuần bạn muốn làm gì ?");
            System.out.println("1.Đi học Java");
            System.out.println("2.Đi chơi công viên ngắm gấu");
            System.out.println("3.Đi (về) nhà nghỉ");
            System.out.println("4.Ra sông hồng tắm tiên");
            System.out.println("5.Ngủ cả ngày");
            System.out.println("6.Thoát");
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui lòng đưa ra lựa chọn của bạn!");
            n = sc.nextInt();
            switch (n){
                case 1:
                    System.out.println("Đi học Java vui vẻ!");
                    break;
                case 2:
                    System.out.println("Đi chơi công viên coi chừng mưa");
                    break;
                case 3:
                    System.out.println("Đi về nhà cần thận!");
                    break;
                case 4:
                    System.out.println("Đi tắm nhớ mang phao!");
                    break;
                case 5:
                    System.out.println("Ngủ quá giờ trưa!");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng lựa chọn!!!");
                    break;
            }
        }
    }
}
