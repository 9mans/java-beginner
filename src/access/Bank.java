package access;

public class Bank {
    private int money;
    // 입금
    public void deposit(int amount) {
        if (valid(amount)) {
            money += amount;
        } else {
            System.out.println("정상적인 금액이 아닙니다.");
        }
    }
    // 검증
    private boolean valid(int amount) {
        // 입금액이 0 보다 커야한다.
        return amount > 0;
    }
    // 출금
    public void withdraw(int amount) {
        if (valid(amount) && money - amount >= 0) {
            money -= amount;
        } else {
            System.out.println("정상적인 금액이 아닙니다.");
        }
    }
    public int getMoney() {
        return money;
    }
}
