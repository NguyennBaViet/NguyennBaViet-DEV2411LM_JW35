import java.util.Scanner;

public class SimpleCaculator {
    public static void main(String[] args) {
        //khai báo
        int soA,soB;
        float ketQua=0;
        String phepTinh;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter so A: ");
        soA = input.nextInt();
        System.out.print("Enter so B: ");
        soB = input.nextInt();
        System.out.print("phep tinh ");
        phepTinh = input.next();

        //Thực hiện tính toán
        switch (phepTinh) {
            case "+":
                ketQua = soA + soB;
                break;
            case "-":
                ketQua = soA - soB;
                break;
            case "*":
                ketQua = soA * soB;
                break;
            case "/":
                ketQua = soA/soB;
                break;

        }
    }
}
