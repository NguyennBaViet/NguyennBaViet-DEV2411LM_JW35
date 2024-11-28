import java.util.Scanner;

public class Lab02_th12 {
    private float Toan;
    private float Ly;
    private float Hoa;
    void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Điểm Toán: ");
        Toan = sc.nextFloat();
        System.out.println("Điểm Lý: ");
        Ly = sc.nextFloat();
        System.out.println("Điểm Hóa: ");
        Hoa = sc.nextFloat();
    }
    void KetQua(){
        if(Toan <4){
            System.out.println("Thi lại môn toán");
        }else if(Ly < 4){
            System.out.println("Thi lại môn lý");
        }else if (Hoa < 4){
            System.out.println("Thi lại môn hóa");
        }else if (Toan+Ly+Hoa >= 15 ){
            System.out.println("Đậu");
        }else if (Toan+Ly+Hoa > 15 && Toan >5 && Ly > 5 && Hoa > 5){
            System.out.println("Học đều các môn");
        }else if (Toan+Ly+Hoa > 15 && Toan <5 && Ly < 5 && Hoa < 5){
            System.out.println("Học chưa đều các môn");
        }else{
            System.out.println("Thi hỏng");
        }
    }
    public static void main(String[] args) {
        Lab02_th12 lab = new Lab02_th12();
        lab.NhapThongTin();
        lab.KetQua();
    }
}
