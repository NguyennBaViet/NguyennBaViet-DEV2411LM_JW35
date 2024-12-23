package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FlowerTest {
    static ArrayList<Flower> flowers = new ArrayList<Flower>();
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập số loài hoa: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Flower f = new Flower();
            System.out.println("Vui lòng nhập thông tin các loài hoa: ");
            f.input();
            flowers.add(f);
        }
    }
    public void display(){
        for (Flower f : flowers) {
            System.out.println(f);
        }
    }
    public void sapXep(){
        flowers.sort((Flower c1,Flower c2) -> c1.getFlowerName().compareTo(c2.getFlowerName()));
        System.out.println("Danh sách được sắp xếp: ");
        for (Flower f : flowers) {
            System.out.println(f.toString());
        }
    }
    public void timKiem(){
        System.out.println("Nhập mã loài hoa bạn muốn tìm");
        Scanner sc = new Scanner(System.in);
        String FlowID = sc.nextLine();
        boolean find = false;
        for (Flower f : flowers) {
            if (f.getFlowerID().equals(FlowID)) {
                find = true;
                System.out.println("Loài hoa bạn muốn tìm: ");
                System.out.println(f.toString());
            }if(!find){
                System.out.println("Cửa hàng không có hoa bạn muốn");
            }
        }
    }
    public void displayFind(){
        String FlowColor = "Trắng";
        boolean find = false;
        for (Flower f : flowers) {
            if(f.getColor().equals(FlowColor)){
                find = true;
                System.out.println(f.toString());
            }if(!find){
                System.out.println("Cửa hàng không có loài hoa nào máu trắng!");
            }
        }
    }
    public int ShowMenu(){
        System.out.println("1.Nhập thông tin n loại hoa");
        System.out.println("2.Hiển thị thông tin vừa nhập");
        System.out.println("3.Sắp xếp danh sách tăng dần theo tên hoa");
        System.out.println("4.Tìm kiếm theo FlowerID");
        System.out.println("5.Hiển thị tất cả loài hoa có màu trắng");
        System.out.println("6.Thoát");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args) {
        FlowerTest ft = new FlowerTest();
        int choice;
        do{
            choice = ft.ShowMenu();
            switch(choice){
                case 1:
                    ft.input();
                    break;
                    case 2:
                        ft.display();
                        break;
                        case 3:
                            ft.sapXep();
                            break;
                            case 4:
                                ft.timKiem();
                                break;
                                case 5:
                                    ft.displayFind();
                                    break;
                                    case 6:
                                        System.exit(0);
                                        break;
                                        default:
                                            System.out.println("Vui lòng chọn từ 1 -> 6");
                                            break;

            }
        }while(true);
    }
}
