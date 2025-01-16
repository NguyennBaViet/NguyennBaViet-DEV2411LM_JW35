package BTH;

public class MainClass {
    public static void main(String[] args) {
        MyGenerics<Integer> integerMyGenerics = new MyGenerics<>();
        integerMyGenerics.setT(123);
        System.out.println("Giá trị int là: "+ integerMyGenerics.getT());

        MyGenerics<Float> floatMyGenerics = new MyGenerics<>();
        floatMyGenerics.setT(3.4f);
        System.out.println("Giá trị float là: "+ floatMyGenerics.getT());

        MyGenerics<String> stringMyGenerics = new MyGenerics<>();
        stringMyGenerics.setT("Hello World!");
        System.out.println("Giá trị String là: "+ stringMyGenerics.getT());
    }
}
