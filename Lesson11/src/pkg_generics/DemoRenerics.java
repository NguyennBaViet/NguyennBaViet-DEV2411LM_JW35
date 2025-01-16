package pkg_generics;

public class DemoRenerics {
    // Tạo phương thức renerics
    public static <E> void printArray(E[] arr){
        for(E e : arr){
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    //test
    public static void main(String[] args) {
        Integer[] arr = {1,2,4,6};
        printArray(arr);

        Double[] arr2 = {1.1,2.2,3.3,4.4};
        printArray(arr2);

        Character[] arr3 = {'a','b','c'};
        printArray(arr3);

        String[] arr4 = {"a","b","c"};
        printArray(arr4);

        Boolean[] arr5 = {true,false};
        printArray(arr5);
    }
}
