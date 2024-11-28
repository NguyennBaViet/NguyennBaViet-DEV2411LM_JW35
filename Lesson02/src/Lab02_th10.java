import java.util.Scanner;

public class Lab02_th10 {
    String Mau;
    void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mau : ");
        Mau = sc.nextLine();
    }
    void LuaChon(){
        switch (Mau){
            case "R" :
                System.out.println("RED");
                break;
            case "G" :
                System.out.println("GREEN");
                break;
            case "B" :
                System.out.println("BLUE");
                break;
            default:
                System.out.println("BLACK");
                break;
        }
    }
    public static void main(String[] args) {
        Lab02_th10 lab = new Lab02_th10();
        lab.NhapThongTin();
        lab.LuaChon();
    }
}
