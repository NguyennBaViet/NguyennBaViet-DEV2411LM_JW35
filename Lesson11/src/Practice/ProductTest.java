package Practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới sau khi nhập số nguyên

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + i + ":");

            System.out.print("ID: ");
            String proId = scanner.nextLine();

            System.out.print("Tên sản phẩm: ");
            String proName = scanner.nextLine();

            System.out.print("Nhà sản xuất: ");
            String producer = scanner.nextLine();

            System.out.print("Năm sản xuất: ");
            int yearMaking = scanner.nextInt();

            System.out.print("Giá: ");
            float price = scanner.nextFloat();
            scanner.nextLine(); // Đọc bỏ dòng mới

            Product product = new Product(proId, proName, producer, yearMaking, price);
            productMap.put(i, product);
        }

        System.out.println("Danh sách sản phẩm vừa nhập:");
        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("Danh sách sản phẩm sau khi sắp xếp theo năm sản xuất:");
        productMap.values().stream()
                .sorted((p1, p2) -> Integer.compare(p1.getYearMaking(), p2.getYearMaking()))
                .forEach(System.out::println);
    }
}

