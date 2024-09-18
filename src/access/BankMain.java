package access;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.deposit(10000);
        bank.withdraw(3000);
        System.out.println(bank.getMoney());
    }
}
