package BTH;

public class AdvancedComparionAct {
    public static void main(String[] args) {
        AdvanedComparion<Integer> compInt = new AdvanedComparion<>();
        compInt.maximun(9,15,5);

        AdvanedComparion<Float> compFloat = new AdvanedComparion<>();
        compFloat.maximun(6.3f,5.9f,8.4f);

        AdvanedComparion<String> compString = new AdvanedComparion<>();
        compString.maximun("Việt Nam","Trung Quốc","Hoa Kỳ");
    }
}
