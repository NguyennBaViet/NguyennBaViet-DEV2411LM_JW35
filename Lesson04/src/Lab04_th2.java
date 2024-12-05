 import java.util.Scanner;
public class Lab04_th2 {
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
        TongTienHang = GiaMotChiec * SoLuong;
    }
    void xemDuLieu(){
        System.out.println("HoaDonBanhMy{" + "Mã hóa đơn: " + MaHoaDon + ", Ngày hóa đơn: " + NgayHoaDon + ", Tên khách hàng: " + TenKhachHang + ", Địa chỉ: " + DiaChiKH +", Số lượng bánh: " +SoLuong + ", Giá 1 chiếc: " + GiaMotChiec +", Tổng tiền hàng: " + TongTienHang +", Tiền khuyến mãi: " + TienKhuyenMai + ", Tổng tiền phải thanh toán: " + TongTienThanhToan + "}" );
    }
    double giamGiaTungChiec(int KMai){
        return TongTienHang = (GiaMotChiec - GiaMotChiec * (KMai / 100))* SoLuong;
    }
    double tinhTienThanhToan(double bonus){
        return TongTienHang - TongTienHang * (bonus / 100);
    }
    public static void main(String[] args) {
        Lab04_th2 HD_1 = new Lab04_th2();
        Lab04_th2 HD_2 = new Lab04_th2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dữ liệu hóa đơn 1: ");
        HD_1.NhapDuLieu();
        System.out.println("Nhập dữ liệu hóa đơn 2: ");
        HD_2.NhapDuLieu();
        HD_1.xemDuLieu();
        HD_2.xemDuLieu();
        System.out.printf("Tiền Hóa Đơn 1: %.0f ",HD_1.giamGiaTungChiec(10));
        System.out.printf("Tiền Hóa Đơn 2: %.0f ",HD_2.tinhTienThanhToan(20));
    }
}

