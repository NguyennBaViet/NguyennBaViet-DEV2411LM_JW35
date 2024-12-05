import java.util.Scanner;

public class Lab04_th1 {
    private static Object NhapDuLieu;
    int MaHoaDon;
    String NgayHoaDon;
    String TenKhachHang;
    String DiaChiKH;
    int SoLuong;
    double GiaMotChiec;
    double TongTienHang;
    double TienKhuyenMai;
    double TongTienThanhToan;

    void NhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("MaHoaDon: ");
        MaHoaDon = sc.nextInt();
        System.out.println("NgayHoaDon: ");
        NgayHoaDon = sc.next();
        System.out.println("TenKhachHang: ");
        TenKhachHang = sc.next();
        System.out.println("DiaChiKH: ");
        DiaChiKH = sc.next();
        System.out.println("SoLuong: ");
        SoLuong = sc.nextInt();
        System.out.println("GiaMotChiec: ");
        GiaMotChiec = sc.nextDouble();
        System.out.println("TongTienHang: ");
        TongTienHang = sc.nextDouble();
        System.out.println("TienKhuyenMai: ");
        TienKhuyenMai = sc.nextDouble();
        System.out.println("TongTienThanhToan: ");
        TongTienThanhToan = sc.nextDouble();
    }
}
