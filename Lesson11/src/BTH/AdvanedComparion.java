package BTH;

public class AdvanedComparion <T extends Comparable<T>>{
    public void maximun(T a, T b,T c){
        T max = a;
        if(b.compareTo(a) > 0){
            max = b;
        }if(c.compareTo(b) > 0){
            max = c;
        }
        System.out.println("Maximun "+ max);
    }
}
