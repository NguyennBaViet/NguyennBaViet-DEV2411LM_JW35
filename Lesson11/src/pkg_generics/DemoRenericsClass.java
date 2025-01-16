package pkg_generics;

public class DemoRenericsClass <T>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }

    //test
    public static void main(String[] args) {
        DemoRenericsClass <String> d = new DemoRenericsClass <String>();
        d.setT("Hello");
        System.out.println(d.getT());

        DemoRenericsClass <Integer> d2 = new DemoRenericsClass <Integer>();
        d2.setT(123);
        System.out.println(d2.getT());
    }
}
