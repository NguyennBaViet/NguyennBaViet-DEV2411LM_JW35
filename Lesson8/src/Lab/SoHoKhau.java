package Lab;

public class SoHoKhau{
    private int soNhanKhau;
    HoKhau[] arrThanhVien;

    public SoHoKhau() {}
    public SoHoKhau(int SoNhanKhau){
        this.soNhanKhau = SoNhanKhau;
        arrThanhVien = new HoKhau[SoNhanKhau];
    }
    public void nhapDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++){
            System.out.println("Nhân khẩu thứ "+i);
            arrThanhVien[i] = new HoKhau();
            arrThanhVien[i].nhapThongTin();
        }
    }
    public void hienDuLieu(){
        for (int i = 0; i < arrThanhVien.length; i++){
            System.out.println("Thành viên thứ " +(i +1));
            HoKhau thanhVien = arrThanhVien[i];
            thanhVien.hienThongTin();
        }
    }
}
