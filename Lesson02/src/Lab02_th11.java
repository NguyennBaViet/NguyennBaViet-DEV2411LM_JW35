import java.util.Scanner;

public class Lab02_th11 {
    int x,y;
    String PhepTinh;
    void NhapGiaTri(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Gia Tri x: ");
        x = sc.nextInt();
        System.out.print("Nhap Gia Tri y: ");
        y = sc.nextInt();
        System.out.print("Nhap Gia Tri PhepTinh: ");
        PhepTinh = sc.next();
    }
    void TinhToan(){
        switch (PhepTinh){
            case "+":
                System.out.println("x+y");
                break;
            case "-":
                System.out.println("x-y");
                break;
            case "*":
                System.out.println("x*y");
                break;
            case "/":
                if(y==0){
                    System.out.println("Không chia được");
                }else{
                System.out.println("x/y");}
                break;
        }
    }
    public static void main(String[] args) {
        Lab02_th11 obj = new Lab02_th11();
        obj.NhapGiaTri();
        obj.TinhToan();
    }
}
