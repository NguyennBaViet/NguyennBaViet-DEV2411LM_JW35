import java.util.Scanner;

public class Lab02_th4 {
    //Hàm giải phương trình bậc nhất
    void giaiPhuongTrinhB1(float a,float b){
        if(a==0){
            if(b==0){
                System.out.printf("\n PT: %.1f.x + %.1f = 0 => Có vô số nghiệm",a,b);
            }else{
                System.out.printf("\n PT: %.1f.x + %.1f = 0 => Có vô nghiệm",a,b);
            }
        }else{
            float x=-b/a;
            System.out.printf("\n PT: %.1f.x + %.1f = 0 => Có nghiệm x = %.1f",a,b,x);
        }
    }
    //Hàm giải phương trình bậc 2
    void giaiPhuongTrinhB2(float a,float b,float c){
        if(a==0){
            giaiPhuongTrinhB1(b,c);
        }else{
            float delta = b*b-4*a*c;
            if(delta<0){
                System.out.printf("\n PT: %.1f.x^2 + %.1f.x +%.1f => Vô nghiệm",a,b,c);
            }else if(delta == 0){
                float x=-b/(2*a);
                System.out.printf("\n PT: %.1f.x^2 + %.1f.x +%.1f => Có nghiệm kép",a,b,c,x);
            }else{
                float x1=(-b -(float)Math.sqrt(delta))/(2*a);
                float x2=(-b + (float)Math.sqrt(delta))/(2*a);
                System.out.printf("\n PT: %.1f.x^2 + %.1f.x +%.1f => PT có 2 nghiệm",a,b,c);
                System.out.printf("\n x1 = %f.x1",x1);
                System.out.printf("\n x2 = %f.x2",x2);
            }
        }
    }
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = sc.nextFloat();
        System.out.println("Nhập b: ");
        b = sc.nextFloat();
        System.out.println("Nhập c: ");
        c = sc.nextFloat();
        Lab02_th4 g = new Lab02_th4();
        g.giaiPhuongTrinhB1(a,b);
        g.giaiPhuongTrinhB2(a,c,b);
    }
}
