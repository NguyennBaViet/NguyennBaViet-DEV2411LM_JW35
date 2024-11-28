import java.util.Scanner;

public class Lab02_th6 {
    int a,b,c;
    void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();
    }
    void KiemTra(){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Đây không phải một tam giác");
                }
            }
        }else{
            if((a+b >c) && (b+c > a) && (a+c > b)){
                System.out.println("Đây là một tam giác");
            }else{
                System.out.println("Đây không phải một tam giác");
            }
        }
    }
    void tinhToan(){
        System.out.println("Diện tích tam giác trên là: ");
        int s = (a + b + c) / 2;
        double sqrt = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println(sqrt);
        System.out.println("Chu vi tam giác trên là: ");
        int v = (a + b + c);
        System.out.println(v);
    }
    public static void main(String[] args) {
        Lab02_th6 t = new Lab02_th6();
        t.NhapThongTin();
        t.KiemTra();
        t.tinhToan();
    }
}
