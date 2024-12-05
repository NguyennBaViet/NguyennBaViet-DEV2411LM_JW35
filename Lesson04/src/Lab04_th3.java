import java.util.Scanner;

public class Lab04_th3 {
    private static Object NhapDuLieu,xemDuLieu;
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
    void xemDuLieu(){
        System.out.println("HoaDonBanhMy{" + "Mã hóa đơn: " + MaHoaDon + ", Ngày hóa đơn: " + NgayHoaDon + ", Tên khách hàng: " + TenKhachHang + ", Địa chỉ: " + DiaChiKH +", Số lượng bánh: " +SoLuong + ", Giá 1 chiếc: " + GiaMotChiec +", Tổng tiền hàng: " + TongTienHang +", Tiền khuyến mãi: " + TienKhuyenMai + ", Tổng tiền phải thanh toán: " + TongTienThanhToan + "}" );
    }
    public static void main(String[] args) {
        Lab04_th3 HD_1 = new Lab04_th3();
        Lab04_th3 HD_2 = new Lab04_th3();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu hóa đơn 1: ");
        HD_1.NhapDuLieu();
        System.out.println("Nhập dữ liệu hóa đơn 2: ");
        HD_2.NhapDuLieu();
        HD_1.xemDuLieu();
        HD_2.xemDuLieu();

    }
}
