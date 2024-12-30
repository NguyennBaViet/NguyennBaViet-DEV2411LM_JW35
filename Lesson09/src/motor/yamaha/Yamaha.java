package motor.yamaha;

import motor.Motor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Yamaha {
    private ArrayList<Motor> motorList = new ArrayList<>();

    public int showMenu(){
        System.out.println("Welcome to Yamaha");
        System.out.println("1.Input");
        System.out.println("2.Display");
        System.out.println("3.Sort");
        System.out.println("4.Search");
        System.out.println("5.Exit");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public void inputMotors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin cho 3 xe Jupiter: ");
        for (int i = 0; i < 3; i++) {
            Motor motor = new Motor();
            motor.inputInfo();
            motorList.add(motor);
        }
        System.out.println("Nhập thông tin cho 3 xe Serius: ");
        for (int i = 0; i < 3; i++) {
            Motor motor = new Motor();
            motor.inputInfo();
            motorList.add(motor);
        }
    }
    public void displayMotors(){
        System.out.println("Danh sách xe: ");
        for (Motor motor : motorList) {
            motor.displayInfo();
        }
    }
    public void sortMotors(){
        System.out.println("Danh sách trước khi sắp xếp: ");
        displayMotors();
        Collections.sort(motorList,new Comparator<Motor>() {

            /**
             * @param o1 the first object to be compared.
             * @param o2 the second object to be compared.
             * @return
             */
            @Override
            public int compare(Motor o1, Motor o2) {
                return Double.compare(o1.getCapacity(), o2.getCapacity());
            }
        });
        System.out.println("Danh sách sau khi sắp xếp: ");
        displayMotors();
    }
    public void searchMotors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên loại xe cần tìm: ");
        String searchName = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        for (Motor motor : motorList) {
            if (motor.getName().toLowerCase().contains(searchName.toLowerCase())) {
                motor.displayInfo();
            }
        }
    }

    public static void main(String[] args) {
        Yamaha yamaha = new Yamaha();
        int Chon =0;
        do {
            Chon = yamaha.showMenu();
            switch (Chon) {
                case 1:
                    yamaha.inputMotors();
                    break;
                    case 2:
                        yamaha.displayMotors();
                        break;
                        case 3:
                            yamaha.sortMotors();
                            break;
                            case 4:
                                yamaha.searchMotors();
                                break;
                                case 5:
                                    System.exit(0);
                                    break;
                                    default:
                                        System.out.println("Vui lòng chọn từ 1 -> 5");
                                        break;

            }
        }while (Chon != 5);
    }
}
