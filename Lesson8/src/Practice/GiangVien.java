package Practice;

import java.util.Scanner;

public class GiangVien {
    private String hoTen;
    private String email;
    private String diaChi;
    private String dienThoai;
    private int soGioGiang;

    public GiangVien() {
    }
    public GiangVien(String hoTen,String email,String diaChi,String dienThoai,int soGioGiang) {
        this.hoTen = hoTen;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.soGioGiang = soGioGiang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public int getSoGioGiang() {
        return soGioGiang;
    }

    public void setSoGioGiang(int soGioGiang) {
        this.soGioGiang = soGioGiang;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên: ");
        hoTen = sc.nextLine();
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println("Dia Chi: ");
        diaChi = sc.nextLine();
        System.out.println("Dien Thoai: ");
        dienThoai = sc.nextLine();
        System.out.println("SoGioGiang: ");
        soGioGiang = sc.nextInt();
    }
    public void hienThiThongTin(){
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Email: "+email);
        System.out.println("Dia Chi: "+diaChi);
        System.out.println("Dien Thoai: "+dienThoai);
        System.out.println("SoGioGiang: "+soGioGiang);
    }

    public int soGioGiang() {
        return soGioGiang;
    }
}
