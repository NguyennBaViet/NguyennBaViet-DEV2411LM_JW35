import java.util.Scanner;

public class Lab03_th10 {
    static int n;
    void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
    }
    boolean KiemTraSoHoanHao(){
        int tong = 0;
        int temp = n;
        for(int i = 1; i < temp; i++){
            if(temp % i == 0){
                tong +=i;
            }
            if(tong == temp){
               return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Lab03_th10 th10 = new Lab03_th10();
        th10.NhapThongTin();
        th10.KiemTraSoHoanHao();
        if(th10.KiemTraSoHoanHao() == true){
            System.out.println("Số hoàn hảo");
        }else{
            System.out.println("Không phải số hoàn hảo");
        }
    }
}
