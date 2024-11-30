import java.util.Scanner;

public class Lab03_th7 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        // ý A
        for(int i = 1; i < n; i++){
            if(i % 2 != 0){
                System.out.print("Số lẻ nhỏ hơn n là: "+i +" ");
            int tong =0;
            tong = i * i;
            System.out.println("Tổng bình phương là: "+tong);
            }
        }
    }
}
