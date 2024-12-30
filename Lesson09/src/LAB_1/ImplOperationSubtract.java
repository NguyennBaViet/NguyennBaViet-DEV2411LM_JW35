package LAB_1;

public class ImplOperationSubtract implements IAccuracy,ITinhToan {
    private int accuracy;

    /**
     * @param accuracy
     */
    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    /**
     * @param num1
     * @param num2
     */
    @Override
    public void doOperation(float num1, float num2) {
        System.out.printf("\nResult = %."+this.accuracy+"f",(num1 - num2));
    }
}
