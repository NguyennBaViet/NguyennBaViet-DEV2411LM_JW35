import java.util.Scanner;

public class Lab02_th3 {
    private String ten;
    private String maSv;
    private  float diemLyThuyetJava;
    private  float diemThucHanhJava;

    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        ten = sc.nextLine();
        System.out.println("Nhập mã sinh viên: ");
        maSv = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        diemLyThuyetJava = sc.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        diemThucHanhJava = sc.nextFloat();
    }
    void xepLoai(){
        System.out.println("Tên: "+ten);
        System.out.println("Mã Sinh Viên: "+maSv);
        if(diemThucHanhJava <4) {
            System.out.println("Thi lại thực hành");
        }else if(diemLyThuyetJava <4){
            System.out.println("Thi lại lý thuyết");
        }else if((diemLyThuyetJava + diemThucHanhJava)/2 >=8){
            System.out.println("Giỏi");
        }else if((diemThucHanhJava + diemLyThuyetJava)/2 >=6){
            System.out.println("Khá");
        }else{
            System.out.println("Trung bình");
        }
    }
    public static void main(String[] args) {
        Lab02_th3 th3 = new Lab02_th3();
        th3.nhapThongTin();
        th3.xepLoai();
    }
}
