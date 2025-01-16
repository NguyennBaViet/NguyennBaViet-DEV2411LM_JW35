package Practice;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Bai3 {
    public static void main(String[] args) {
        Map<Integer, String> quocGiaMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng quốc gia: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng mới sau khi nhập số nguyên

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập tên quốc gia thứ " + i + ": ");
            String quocGia = scanner.nextLine();
            quocGiaMap.put(i, quocGia);
        }

        System.out.println("Danh sách quốc gia vừa nhập: " + quocGiaMap);

        Map<Integer, String> quocGiaSapXep = quocGiaMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("Danh sách quốc gia sau khi sắp xếp: " + quocGiaSapXep);
    }
}
