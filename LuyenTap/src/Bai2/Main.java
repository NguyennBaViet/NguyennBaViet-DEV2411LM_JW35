package Bai2;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienBanHang("Nguyen Van A", "Ha Noi", 30);
        NhanVien nv2 = new CongNhan("Tran Van B", "Hai Phong", 50);

        nv1.HienThi();
        nv2.HienThi();
    }
}

