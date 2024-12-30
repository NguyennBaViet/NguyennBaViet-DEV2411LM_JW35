package LAB_1;

public class MainClass {
    public void phepTinh(ITinhToan phepTinh,float num1, float num2) {
        phepTinh.doOperation(num1, num2);
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        ImplOperationAdd add = new ImplOperationAdd();
        add.setAccuracy(IAccuracy.TWO_NUMBER);
        obj.phepTinh(add,6,9);
        ImplOperationSubtract subtract = new ImplOperationSubtract();
        subtract.setAccuracy(IAccuracy.THREE_NUMBER);
        obj.phepTinh(subtract,9,6);
        ImplOperationMultiply multiply = new ImplOperationMultiply();
        multiply.setAccuracy(IAccuracy.FOUR_NUMBER);
        obj.phepTinh(multiply,6,6);
    }
}
