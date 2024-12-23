package Practice;

import java.util.Scanner;

public class Flower {
    private String FlowerID;
    private String FlowerName;
    private String color;
    private int kindOfFlower;

    public Flower() {
    }
    public Flower(String FlowerID, String FlowerName, String color, int kindOfFlower) {
        this.FlowerID = FlowerID;
        this.FlowerName = FlowerName;
        this.color = color;
        this.kindOfFlower = kindOfFlower;
    }

    public String getFlowerID() {
        return FlowerID;
    }

    public void setFlowerID(String flowerID) {
        FlowerID = flowerID;
    }

    public String getFlowerName() {
        return FlowerName;
    }

    public void setFlowerName(String flowerName) {
        FlowerName = flowerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKindOfFlower() {
        return kindOfFlower;
    }

    public void setKindOfFlower(int kindOfFlower) {
        this.kindOfFlower = kindOfFlower;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Flower ID: ");
        FlowerID = sc.nextLine();
        System.out.println("Enter Flower Name: ");
        FlowerName = sc.nextLine();
        System.out.println("Enter Flower Color: ");
        color = sc.nextLine();

        System.out.println("Có 3 loại hoa này");
        System.out.println("1.Hồng Đỏ");
        System.out.println("2.Hồng Vàng");
        System.out.println("3.Hồng trắng");
        kindOfFlower = sc.nextInt();
        switch (kindOfFlower){
            case 1:
                System.out.println("Hồng Đỏ");
                break;
                case 2:
                    System.out.println("Hồng Vàng");
                    break;
                    case 3:
                        System.out.println("Hồng Trắng");
                        break;
                        default:
                            System.out.println("Loại hoa này đã hết rồi!");
                            break;
        }
    }
    public void display(){
        System.out.println("Flower ID: " + FlowerID);
        System.out.println("Flower Name: " + FlowerName);
        System.out.println("Flower Color: " + color);
        System.out.println("Kind of Flower: " + kindOfFlower);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "FlowerID='" + FlowerID + '\'' +
                ", FlowerName='" + FlowerName + '\'' +
                ", color='" + color + '\'' +
                ", kindOfFlower=" + kindOfFlower +
                '}';
    }
}
