import java.util.Scanner;

public class Lab02_th2 {
    String ten;
    String nhaSanXuat;
    int soLuongBanhXe;
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên");
        ten = sc.nextLine();
        System.out.print("Nhap thong tin nha san xuat ");
        nhaSanXuat = sc.nextLine();
        System.out.print("Nhap thong tin so luong banh xe ");
        soLuongBanhXe = sc.nextInt();
    }
    void hienThiThongTin(){
        System.out.println("Tên"+ten);
        System.out.println("Nha san xuat"+nhaSanXuat);
        System.out.println("so luong banh xe "+soLuongBanhXe);
    }
    public static void main(String[] args) {
        Lab02_th2 t = new Lab02_th2();
        t.nhapThongTin();
        t.hienThiThongTin();
    }
}
