package pgk_Collection;

import java.util.ArrayList;
import java.util.List;

public class Demo1ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        printArrayList(list);

        List<Float> list1 = new ArrayList<Float>();
        list1.add(1.1f);
        list1.add(2.2f);
        list1.add(3.3f);
        list1.add(4.4f);
        printArrayList(list1);
    }
    public static <E> void printArrayList(List<E> arrayList) {
        System.out.println("Danh sach ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "; ");
        }
    }
}
