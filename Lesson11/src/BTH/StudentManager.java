package BTH;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
        List<String> lstSinhVien = new ArrayList<>();
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.testList();
        sm.updateList();
        sm.deleteList();
    }
    public void testList(){
        lstSinhVien.add("Tuấn");
        lstSinhVien.add("Tú");
        lstSinhVien.add("Nam");
        lstSinhVien.add("Hà");
        lstSinhVien.add("Việt");
        System.out.println("Danh sách sinh viên");
        System.out.println(lstSinhVien);
    }
    public void updateList(){
        lstSinhVien.set(1,"Thảo");
        System.out.println("Danh sách sinh viên đã cập nhật");
        System.out.println(lstSinhVien);
    }
    public void deleteList(){
        lstSinhVien.remove(2);
        System.out.println("Danh sách sinh viên sau khi xóa");
        System.out.println(lstSinhVien);
    }
}
