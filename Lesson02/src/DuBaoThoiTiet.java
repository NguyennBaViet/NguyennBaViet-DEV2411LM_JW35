import java.util.Scanner;

public class DuBaoThoiTiet {
    static int status;
    void NhapDuLieu(){
        System.out.println("Dự báo thời tiết chuồn chuồn");
        System.out.println("1.Bay cao");
        System.out.println("2.Bay vừa");
        System.out.println("3.Bay thấp");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập trạng thái bay của chuồn chuồn từ 1->3");
        status = input.nextInt();
    }
    void HienThiDuBao() {
        switch (status){
            case 1:
                System.out.println("Trời nắng");
                break;
            case 2:
                System.out.println("Trời nhiều mây");
                break;
            case 3:
                System.out.println("Trời mưa");
                break;
            default:
                System.out.println("Không có dữ liệu trong dự báo chuồn chuồn!");
                break;
        }
    }
    public static void main(String[] args) {
        DuBaoThoiTiet obj = new DuBaoThoiTiet();
        obj.NhapDuLieu();
        obj.HienThiDuBao();
    }
}
