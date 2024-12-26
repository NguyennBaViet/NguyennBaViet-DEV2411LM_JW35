package Lab;

import java.util.Scanner;

public class NhanKhau {
    private String hoTen;
    private String ngaySinh;
    private boolean gioiTinh;

    public String getHoTen() {
        return hoTen;
    }
    public NhanKhau() {
    }
    public NhanKhau(String hoTen, String ngaySinh, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gioiTinh = sc.nextBoolean();
    }
    public void hienThongTin(){
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Gioi tinh: "+gioiTinh);
    }

    @Override
    public String toString() {
        return "NhanKhau{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
