package oop1.ex;

public class Account {
    int balance;

    public int deposit(int amount) {
        return balance += amount;
    }

    public int withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액부족 잔고를 확인하세요");
            return balance;
        } else {
            return balance -= amount;
        }
    }

    public int status() {
        return balance;
    }
}
