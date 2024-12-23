package theory;
class NhanVien{
    String name;
    static int count;
}
public class bth_2 {
    public static void main(String[] args) {
        NhanVien[] nv = new NhanVien[3];
        //Nhan vien 1
        nv[0] = new NhanVien();
        nv[0].name = "A";
        nv[0].count++;
        //Nhan vien 2
        nv[1] = new NhanVien();
        nv[1].name = "B";
        nv[1].count++;
        //Nhan vien 3
        nv[2] = new NhanVien();
        nv[2].name = "C";
        nv[2].count++;

        System.out.println("Danh sách: ");
        for(NhanVien item : nv){
            System.out.println(item.name + " " + item.count);
        }
    }
}
