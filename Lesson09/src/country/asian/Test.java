package country.asian;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<AsianCountry> countries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("===== MENU ====== ");
            System.out.println("\n1. Nhập thông tin n đất nước");
            System.out.println("\n2.Hiển thị thông tin");
            System.out.println("\n3.Sắp xếp theo diện tích giảm dần");
            System.out.println("\n4.Tìm thông tin của quốc gia");
            System.out.println("\n5.Thoát");
            System.out.print("Vui lòng chọn một lựa chọn");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println(" Nhập số lượng quốc gia");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        AsianCountry country = new AsianCountry();
                        country.input();
                        countries.add(country);
                    }
                    break;
                    case 2:
                        for (AsianCountry ct : countries) {
                            ct.display();
                            System.out.println();
                        }
                        break;
                        case 3:
                            Collections.sort(countries, new Comparator<AsianCountry>() {
                                @Override
                                public int compare(AsianCountry o1, AsianCountry o2) {
                                    return Double.compare(o2.getArea(), o1.getArea());
                                }
                            });
                            System.out.println("Danh sách sau khi sắp xếp theo diện tích: ");
                            for (AsianCountry ctr : countries) {
                                ctr.display();
                                System.out.println();
                            }
                            break;
                            case 4:
                                System.out.print("Nhập tên quốc gia muốn tìm: ");
                                String searchName = sc.nextLine();
                                boolean found = false;
                                for (AsianCountry country : countries) {
                                    if(country.getCountryName().equalsIgnoreCase(searchName)){
                                        country.display();
                                        found = true;
                                        break;
                                    }
                                }
                                if(!found){
                                    System.out.print("Không tìm thấy thông tin quốc gia mà bạn muốn !");
                                }
                                break;
                                case 5:
                                    System.exit(0);
                                    break;
                                    default:
                                        System.out.print("Vui lòng chọn từ 1 -> 5");
                                        break;
            }
        }
    }
}
