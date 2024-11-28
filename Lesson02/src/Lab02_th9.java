import java.util.Scanner;

public class Lab02_th9 {
    String LuaChon;
    void NhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập lựa chọn kéo-búa-giấy của bạn theo giá trị K-B-G : ");
        LuaChon = sc.nextLine();
    }
    void HienThiKetQua(){
        switch (LuaChon){
            case "B":
                System.out.println("Thắng Kéo,thua Giấy");
                break;
            case "K":
                System.out.println("Thắng Giấy, Thua Búa");
                break;
            case "G":
                System.out.println("Thắng Búa, Thua Kéo");
        }
    }
    public static void main(String[] args) {
        Lab02_th9 lab = new Lab02_th9();
        lab.NhapDuLieu();
        lab.HienThiKetQua();
    }
}
