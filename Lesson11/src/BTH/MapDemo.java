package BTH;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> students = new HashMap<>();
        students.put("K02","Việt");
        students.put("K58","Nam");
        students.put("K21","Mạnh");
        students.put("K19","Thảo");
        students.put("K46","Thanh");
        students.put("K36","Hưng");

        for (Map.Entry<String,String> entrySet : students.entrySet()){
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println(key+" - "+value);
        }
        System.out.println("Sinh viên có mã sinh viên = 19 - " +students.get("K19"));
        students.remove("K21");
        System.out.println("Danh sách sau khi xóa: "+students);
    }
}
