package Bai1;

public class SavingAccount extends Account {
    private double rate;
    public SavingAccount(double initialize, double rate) {
        super();
        this.rate = rate;
    }
    public double GetInterest() {
        return GetBalance() * rate;
    }

}
