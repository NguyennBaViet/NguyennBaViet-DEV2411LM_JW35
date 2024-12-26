package Practice;

import java.util.Scanner;

public class QuanLyGiangVien {
    private GiangVien[] qlGiangVien;

    public int showMenu(){
        System.out.println("--MENU--");
        System.out.println("1.Nhập vào thông tin giảng viên");
        System.out.println("2.Xuất danh sách toàn bộ giảng viên");
        System.out.println("3.Xuất danh sách giảng viên cơ hữu");
        System.out.println("4.Xuất danh sách giảng viên thỉnh giảng");
        System.out.println("5.Tính tổng số tiền lương của toàn bộ giảng viên");
        System.out.println("6.Tìm giảng viên có tổng lương cao nhất");
        System.out.println("7.Thoát");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void NhapThongTinGV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số giảng viên cần thêm thông tin: ");
        int ThongTin = sc.nextInt();
        qlGiangVien = new GiangVien[ThongTin];
        for (int i = 0; i < ThongTin; i++){
            System.out.println("Nhập thông tin giảng viên cơ hữu thứ "+(i+1));
            qlGiangVien[i]= new GiangVienCoHuu();
            qlGiangVien[i].nhapThongTin();
        }
        for (int i = 0; i < qlGiangVien.length; i++){
            System.out.println("Nhập thông tin giảng viên thỉnh giảng thứ "+(i+1));
            qlGiangVien[i] = new GiangVienThinhGiang();
            qlGiangVien[i].nhapThongTin();
        }
    }
    public void HienThongTinGV(){
        System.out.println("[Danh sách giảng viên]");
        for (int i = 0; i < qlGiangVien.length; i++){
            qlGiangVien[i].hienThiThongTin();
        }
    }
    public void DanhSachGVCH(){
        qlGiangVien = new GiangVien[qlGiangVien.length];
        for (int i = 0; i < qlGiangVien.length; i++){
            System.out.println("Giảng viên cơ hữu");
            GiangVienCoHuu coHuu = new GiangVienCoHuu();
            qlGiangVien[i] = new GiangVienCoHuu();
            qlGiangVien[i].hienThiThongTin();
        }
    }
    public void DanhSachGVTG(){
        qlGiangVien= new GiangVien[qlGiangVien.length];
        for (int i = 0; i < qlGiangVien.length; i++){
            System.out.println("Giảng viên thỉnh giảng");
            GiangVienThinhGiang thinhGiang = new GiangVienThinhGiang();
            qlGiangVien[i] = new GiangVienThinhGiang();
            qlGiangVien[i].hienThiThongTin();
        }
    }
    public void TongTienLuong(){
        qlGiangVien = new GiangVien[qlGiangVien.length];
        GiangVienCoHuu coHuu = new GiangVienCoHuu();
        GiangVienThinhGiang thinhGiang = new GiangVienThinhGiang();
        double TongLuong = coHuu.tinhLuong()+ thinhGiang.tinhLuong();
        System.out.println("Tôổng tiền lương của toàn bộ giảng viên: "+TongLuong);
    }
    public void TimKiem(){
        GiangVien giangVienMaxLuong = null;
        double maxLuong = 0;
        for (GiangVien gv : qlGiangVien) {
            double luong = 0;
            if (gv instanceof GiangVienCoHuu) {
                luong = ((GiangVienCoHuu) gv).tinhLuong();
            } else if (gv instanceof GiangVienThinhGiang) {
                luong = ((GiangVienThinhGiang) gv).tinhLuong();
            }
            if (luong > maxLuong) {
                maxLuong = luong;
                giangVienMaxLuong = gv;
            }
        }
        if (giangVienMaxLuong != null) {
            System.out.println("Giảng viên có tổng lương cao nhất:");
            giangVienMaxLuong.hienThiThongTin();
        } else {
            System.out.println("Không có giảng viên nào trong danh sách.");
        }
    }

    public static void main(String[] args) {
        QuanLyGiangVien gv = new QuanLyGiangVien();
        int chon =0;
        do{
            chon = gv.showMenu();
            switch (chon) {
                case 1:
                    gv.NhapThongTinGV();
                    break;
                case 2:
                    gv.HienThongTinGV();
                    break;
                case 3:
                    gv.DanhSachGVCH();
                    break;
                case 4:
                    gv.DanhSachGVTG();
                    break;
                case 5:
                    gv.TongTienLuong();
                    break;
                case 6:
                    gv.TimKiem();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }while(chon!=7);
    }
}
