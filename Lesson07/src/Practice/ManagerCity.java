package Practice;

import java.util.*;

public class ManagerCity {
    static ArrayList<City> cityList =new ArrayList<>();
    public void nhap(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Vui lòng nhập số thành phố: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                City c = new City();
                System.out.println("Vui lòng nhập thông tin thành phố: ");
                c.nhap();
                cityList.add(c);
        }
    }
    public void hienThi(){
        for (City c : cityList) {
            System.out.println(c);
        }
    }
    public void sapXep(){
        cityList.sort((City c1, City c2) -> c1.getCountry().compareTo(c2.getCountry()));
        System.out.println("Danh sách đã được sắp xếp");
        for (City c : cityList) {
            System.out.println(c.toString());
        }
    }
    public void timKiem(){
        System.out.println("Nhập mã thành phố muốn tìm: ");
        Scanner sc = new Scanner(System.in);
        String CityId = sc.nextLine();
        boolean found = false;
        for (City c : cityList) {
            if (c.getCityID().equals(CityId)) {
                found = true;
                System.out.println("Thành phố mà bạn muốn tìm kiếm: ");
                System.out.println(c.toString());
            }if(!found){
                System.out.println("Không tìm thấy thành phố với mã của bạn!");
            }
        }
    }
    public int showMenu(){
        System.out.println("Menu!");
        System.out.println("1.Nhập thông tin n thành phố");
        System.out.println("2.Hiển thị thông tin vừa nhập");
        System.out.println("3.Sắp xếp thông tin tăng dần theo tên nước");
        System.out.println("4.Tìm kiếm thông tin theo cityID");
        System.out.println("5.Thoát");
        System.out.print("Vui lòng đưa ra lựa chọn của bạn từ 1 -> 5: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        ManagerCity mc = new ManagerCity();
        int chon;
        do{
            chon =mc.showMenu();
            switch (chon){
                case 1:
                    mc.nhap();
                    break;
                    case 2:
                        mc.hienThi();
                        break;
                        case 3:
                            mc.sapXep();
                            break;
                            case 4:
                                mc.timKiem();
                                break;
                                case 5:
                                    System.exit(0);
                                    break;
                                    default:
                                        System.out.println("Vui lòng chọn từ 1 -> 5 !!!");
                                        break;
            }
        }while (true);
    }
}
