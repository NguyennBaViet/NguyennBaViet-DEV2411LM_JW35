package LAB_1;

public class ImplOperationMultiply implements IAccuracy,ITinhToan{
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
        System.out.printf("\n Result = %." +this.accuracy + "\n",num1*num2);
    }
}
