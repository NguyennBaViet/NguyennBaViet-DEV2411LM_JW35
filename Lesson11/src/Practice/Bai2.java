package Practice;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Bai2 {
        public static void main(String[] args) {
            Set<String> tenThanhPho = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số lượng thành phố: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập tên thành phố thứ " + (i + 1) + ": ");
                String thanhPho = scanner.nextLine();
                tenThanhPho.add(thanhPho);
            }
            System.out.println("Danh sách thành phố vừa nhập: " + tenThanhPho);
            Set<String> tenThanhPhoSapXep = new TreeSet<>(tenThanhPho);
            System.out.println("Danh sách thành phố sau khi sắp xếp: " + tenThanhPhoSapXep);
        }
}
