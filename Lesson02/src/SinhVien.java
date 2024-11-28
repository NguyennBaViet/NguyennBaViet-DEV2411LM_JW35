import java.util.Scanner;

public class SinhVien {
    String name;
    String address;
    int soLanThi;
    float diemJava;
    float lePhiThi;
    char gioiTinh;

    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap name: ");
        name = sc.nextLine();
        System.out.print("Nhap address: ");
        address = sc.nextLine();
        System.out.print("Nhap soLanThi: ");
        soLanThi = sc.nextInt();
        System.out.print("Nhap diemJava: ");
        diemJava = sc.nextFloat();
        System.out.print("Nhap lePhiThi: ");
        lePhiThi = sc.nextFloat();
        System.out.print("Nhap gioiTinh: ");
        gioiTinh = sc.next().charAt(0);

    }
    public static void main(String[] args) {
        //khởi tạo
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        //In ra màn hình
        System.out.println("Name : " + sv.name);
        System.out.println("Address : " + sv.address);
        System.out.println("SoLanThi : " + sv.soLanThi);
        System.out.println("DiemJava : " + sv.diemJava);
        System.out.println("LePhiThi : " + sv.lePhiThi);
        System.out.println("GioiTinh : " + sv.gioiTinh);

    }
}
