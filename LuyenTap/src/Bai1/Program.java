package Bai1;

public class Program {
        public static void main(String[] args) {
            Account account = new Account(1000);
            account.Deposit(500);
            account.WithDraw(200);
            System.out.println("Số dư tài khoản: " + account.GetBalance());

            SavingAccount savingAccount = new SavingAccount(1000, 0.05);
            System.out.println("Tiền lãi: " + savingAccount.GetInterest());

            CheckAccount checkAccount = new CheckAccount(1000, 10);
            checkAccount.Deposit(500);
            checkAccount.WithDraw(200);
            System.out.println("Số dư tài khoản sau khi trừ phí giao dịch: " + checkAccount.GetBalance());
        }

}
