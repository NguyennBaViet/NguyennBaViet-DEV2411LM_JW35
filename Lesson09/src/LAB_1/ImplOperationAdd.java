package LAB_1;

public class ImplOperationAdd implements IAccuracy,ITinhToan {
    private int accuracy;

    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public void doOperation(float num1, float num2) {
        System.out.printf("\n Result Add = %."+this.accuracy+"f\n", num1+num2);
    }
}
