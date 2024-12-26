package Lab;

import java.util.Scanner;

public class HoKhau extends NhanKhau{
    private String diaChiHienNay;
    private String noiCongTac;

    public HoKhau() {}
    public HoKhau(String hoTen,String ngaySinh,boolean gioiTinh,String diaChiHienNay,String noiCongTac) {
        super(hoTen,ngaySinh,gioiTinh);
        this.diaChiHienNay = diaChiHienNay;
        this.noiCongTac = noiCongTac;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập địa chỉ thường trú: ");
        this.diaChiHienNay = sc.nextLine();
        System.out.println("Nhập nơi công tác: ");
        this.noiCongTac = sc.nextLine();
    }
    @Override
    public void hienThongTin(){
        super.hienThongTin();
        System.out.println("Địa chỉ thường trú: "+diaChiHienNay);
        System.out.println("Nơi công tác: "+noiCongTac);
    }

    @Override
    public String toString() {
        String str = super.toString();
        str+= "HoKhau{" +
                "diaChiHienNay='" + diaChiHienNay + '\'' +
                ", noiCongTac='" + noiCongTac + '\'' +
                '}';
        return str;
    }
}
