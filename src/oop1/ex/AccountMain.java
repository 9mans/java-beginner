package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account();

        //입출금
        account.deposit(1000);
        System.out.println("현재 잔액: " + account.balance);

        account.withdraw(900);
        System.out.println("현재 잔액: " + account.balance);

        account.withdraw(300);
        System.out.println("현재 잔액: " + account.balance);

        //잔액확인
        int balance = account.status();
        System.out.println("잔액확인:" + balance);
    }
}
