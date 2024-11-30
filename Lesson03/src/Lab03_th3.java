import java.util.Scanner;

public class Lab03_th3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số từ bàn phím
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        // Tính UCLN
        int ucln = gcdWithFor(num1, num2);

        // Tính BCNN
        int bcnn = lcmWithFor(num1, num2, ucln);

        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 +" là " + ucln);
        System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 +" là " + bcnn);
    }

    // Phương pháp tính UCLN bằng vòng lặp for
    public static int gcdWithFor(int a, int b) {
        for (int temp; b != 0; a = temp) {
            temp = b;
            b = a % b;
        }
        return a;
    }

    // Phương pháp tính BCNN bằng vòng lặp for
    public static int lcmWithFor(int a, int b, int gcd) {
        int lcm = (a > b) ? a : b;
        for (; lcm % a != 0 || lcm % b != 0; lcm++) {
            // Vòng lặp này sẽ chạy cho đến khi tìm được BCNN
        }
        return lcm;
    }
}
