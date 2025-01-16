package BTH;

import java.util.Arrays;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int count[] = {22,1,5,55,19,15,44};
        System.out.println("Danh sách dãy thông thường: "+ Arrays.toString(count));

        TreeSet sortedSet = new TreeSet<Integer>();
        for (int i = 0; i < 5; i++){
            sortedSet.add(count[i]);
        }
        System.out.println("Danh sách đã sắp xếp: ");
        System.out.println(sortedSet);

        System.out.println("Số đầu tiên trong set: "+(Integer) sortedSet.first());
        System.out.println("Số cuối cùng trong set: "+(Integer) sortedSet.last());
    }
}
