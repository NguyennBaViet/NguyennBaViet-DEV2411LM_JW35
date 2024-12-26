package Lab;

import java.util.Scanner;

public class QuanLyHoKhau{
    private SoHoKhau[] arrSoHoKhau;
    public int showMenu(){
        System.out.println("MENU");
        System.out.println("1.Khai báo sổ hộ khẩu");
        System.out.println("2.Danh sách sổ hộ khẩu");
        System.out.println("3.Tìm người");
        System.out.println("4.Thoát");
        System.out.println("Vui lòng nhập từ 1 --> 3");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public void khaiBaoSHK(){
        Scanner sc = new Scanner(System.in);
        System.out.println("[Khai báo sổ hộ khẩu!]");
        System.out.println("Nhập số hộ cần khai báo");
        int soHKhau = sc.nextInt();
        arrSoHoKhau = new SoHoKhau[soHKhau];
        for (int i = 0; i < soHKhau; i++) {
            System.out.println("Nhập số nhân khẩu hộ thứ "+(i+1));
            Scanner inp = new Scanner(System.in);
            arrSoHoKhau[i] = new SoHoKhau(inp.nextInt());
            arrSoHoKhau[i].nhapDuLieu();
        }
        System.out.println("Cảm ơn!");
    }
    public void danhSachSHK(){
        System.out.println("[Danh sách sổ hộ khẩu]");
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            System.out.println("Hộ khẩu thứ "+(i+1));
            arrSoHoKhau[i].hienDuLieu();
        }
    }
    public void TimKiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập người cần tìm: ");
        String tim = sc.nextLine();
        for (int i = 0; i < arrSoHoKhau.length; i++) {
            for (int j = 0;j < arrSoHoKhau[i].arrThanhVien.length; j++){
                if(arrSoHoKhau[i].arrThanhVien[j].getHoTen().equals(tim)){
                    arrSoHoKhau[i].arrThanhVien[j].hienThongTin();
                }
            }
        }
    }

    public static void main(String[] args) {
        QuanLyHoKhau q = new QuanLyHoKhau();
        int chon =0;
        do {
            chon=q.showMenu();
            switch (chon) {
                case 1:
                    q.khaiBaoSHK();
                    break;
                case 2:
                    q.danhSachSHK();
                    break;
                case 3:
                    q.TimKiem();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng chọn từ 1 --> 4");
                    break;
            }
        }while(chon!=4);
    }
}
