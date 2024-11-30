import java.util.Scanner;

public class Lab03_th4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                System.out.print("n không phải số nguyên tố");
                break;
            }else{
                System.out.println("n là số nguyên tố");
            }
        }
    }
    }
