import java.util.Scanner;

public class Lab03_th6 {
    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("chiều dài: ");
        n = sc.nextInt();
        System.out.print("chiều rộng: ");
        m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0 || i == n-1 || j == 0 || j == m-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
