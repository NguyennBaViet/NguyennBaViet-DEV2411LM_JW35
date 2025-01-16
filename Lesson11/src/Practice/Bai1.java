package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> lstSoNguyen = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử của danh sách: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) +": ");
            int num = sc.nextInt();
            lstSoNguyen.add(num);
        }
        System.out.println("Danh sách vừa nhập "+ lstSoNguyen);
        Collections.sort(lstSoNguyen);
        System.out.println("Danh sách sau khi sắp xếp"+lstSoNguyen);
    }
}
