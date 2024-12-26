package Practice;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien{
    private final int soGioQuyDinh=40;
    private float luongThoaThuan;

    public GiangVienCoHuu() {
    }

    public GiangVienCoHuu(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang, float luongThoaThuan) {
        super(hoTen, email, diaChi, dienThoai, soGioGiang);
        this.luongThoaThuan = luongThoaThuan;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhập lương thỏa thuận: ");
        luongThoaThuan = sc.nextFloat();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Giờ định mức: "+soGioQuyDinh);
        System.out.println("Lương thỏa thuận: "+luongThoaThuan);
    }
    public double tinhLuong(){
        if(getSoGioGiang() <= soGioQuyDinh){
            double TongLuong = luongThoaThuan;
            return TongLuong;
        }else{
            double TongLuong = luongThoaThuan + (getSoGioGiang() - soGioQuyDinh) * 200000;
            return TongLuong;
        }
    }
}
