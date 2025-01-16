package pgk_Collection;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println("Size of list: " + list.size());
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Size of list: " + list.size());
        System.out.println("Danh sach: ");
        for (String str : list) {
            System.out.println(str);
        }
        list.remove("B");
        System.out.println("Size of list: " + list.size());
        list.set(0, "D");
        System.out.println("Danh sach: ");
        for (String str : list) {
            System.out.println(str);
        }



    }
}
