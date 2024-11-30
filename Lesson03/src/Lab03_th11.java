import java.util.Scanner;

public class Lab03_th11 {
    public static class lab03_th11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Nhập giá trị n từ bàn phím
            System.out.print("Nhập giá trị n: ");
            int n = scanner.nextInt();
            System.out.println("Các số hoàn hảo từ 1 đến " + n + " là:");
            // Kiểm tra và in ra các số hoàn hảo từ 1 đến n
            for (int i = 1; i <= n; i++) {
                if (isPerfect(i)) {
                    System.out.println(i);
                }
            }
        }
        // Phương pháp kiểm tra một số có phải là số hoàn hảo không
        public static boolean isPerfect(int number) {
            int sum = 0;
            // Tính tổng các ước số của number (ngoại trừ chính nó)
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            // Kiểm tra nếu tổng các ước số bằng chính number
            return sum == number;
        }
    }

}
