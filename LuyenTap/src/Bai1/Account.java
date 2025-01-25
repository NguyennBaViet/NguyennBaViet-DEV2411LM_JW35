package Bai1;

public class Account {
    private double balance;

    public Account(double initialize) {
        this.balance = initialize;
    }
    public void Deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Gửi tiền thành công: " + money);
        } else {
            System.out.println("Số tiền gửi không hợp lệ");
        }
    }
    public void WithDraw(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Rút tiền thành công: " + money);
        } else {
            System.out.println("Số tiền rút không hợp lệ hoặc không đủ số dư");
        }
    }
    public double GetBalance() {
        return balance;
    }

}
