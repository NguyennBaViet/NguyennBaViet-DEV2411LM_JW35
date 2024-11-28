import java.util.Scanner;

public class PhuongTrinhB1 {
    float a, b, c;
    float x;
    //Hàm nhập
    void nhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        a = sc.nextFloat();
        System.out.print("Nhap he so b: ");
        b = sc.nextFloat();
    }
    //Hàm giải phương trình bậc 1
    void giaiPhuongTrinh(){
        if(a!=0){
            x=-b/a;
            System.out.printf("Phương trình %.1fx + %.1f = 0 có nghiệm x=%f",a,b,x);
        }else{
            System.out.printf("Phương trình %.1fx + %.1f = 0  vô nghiệm",a,b);
        }
    }
    public static void main(String[] args) {
        PhuongTrinhB1 p = new PhuongTrinhB1();
        p.nhapDuLieu();
        p.giaiPhuongTrinh();

    }
}
