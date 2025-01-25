package Bai1;

public class CheckAccount extends Account{
    private double feeTransfer;
    public CheckAccount(double initialize, double feeTransfer) {
        super(initialize);
        this.feeTransfer = feeTransfer;
    }
    @Override
    public void Deposit(double money) {
        super.Deposit(money);
        if (money > 0) {
            double newBalance = GetBalance() - feeTransfer;
            System.out.println("Phí giao dịch: " + feeTransfer);
            System.out.println("Số dư sau giao dịch: " + newBalance);
        }
    }
    @Override
    public void WithDraw(double money) {
        super.WithDraw(money);
        if (money > 0 && money <= GetBalance()) {
            double newBalance = GetBalance() - feeTransfer;
            System.out.println("Phí giao dịch: " + feeTransfer);
            System.out.println("Số dư sau giao dịch: " + newBalance);
        }
    }

}
