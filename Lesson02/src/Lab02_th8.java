import java.util.Scanner;

public class Lab02_th8 {
    int n,m;
    void NhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập tháng: ");
        n = sc.nextInt();
        System.out.println("Vui lòng nhập năm: ");
        m = sc.nextInt();
    }
    void SoNgayThang(){
        if (n == 1) {
            if (n == 3) {
                if (n == 5) {
                    if (n == 7) {
                        if (n == 8) {
                            if (n == 10) {
                                if (n == 12) {
                                    System.out.println("Tháng cso 30 ngày");
                                }
                            }
                        }
                    }
                }
            }
        } else if (n == 2 && m % 4 == 0) {
            System.out.println("Tháng có 29 ngày");
        } else if (n == 2) {
            System.out.println("Tháng có 28 ngày");
        } else {
            System.out.println("Tháng có 31 ngày");
        }
    }
    public static void main(String[] args) {
        Lab02_th8 s = new Lab02_th8();
        s.NhapThongTin();
        s.SoNgayThang();
    }
}
