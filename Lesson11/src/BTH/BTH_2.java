package BTH;

public class BTH_2 {
    public static <E> void printArray(E[] arr) {
        for(E element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Giá trị Integer: ");
        printArray(arr);

        Float[] arr1 = {1.1f, 2.2f, 3.3f};
        System.out.println("Giá trị Float: ");
        printArray(arr1);

        String[] arr2 = {"Tôi yêu Việt Nam"};
        System.out.println("Giá trị String: ");
        printArray(arr2);

    }
}
