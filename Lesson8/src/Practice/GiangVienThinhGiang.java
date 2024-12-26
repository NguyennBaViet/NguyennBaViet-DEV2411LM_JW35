package Practice;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String cqLamViec;

    public GiangVienThinhGiang() {}

    public GiangVienThinhGiang(String hoTen, String email, String diaChi, String dienThoai, int soGioGiang, String cqLamViec) {
        super(hoTen, email, diaChi, dienThoai, soGioGiang);
        this.cqLamViec = cqLamViec;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Nhập cơ quan công tác: ");
        cqLamViec = sc.nextLine();
    }
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Cơ quan: "+cqLamViec);
    }
    public double tinhLuong(){
        double TongLuong = getSoGioGiang()*200000;
        return TongLuong;
    }
}
