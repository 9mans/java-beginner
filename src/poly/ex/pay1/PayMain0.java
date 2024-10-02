package poly.ex.pay1;

import java.util.Scanner;

public class PayMain0 {

    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("결제 수단을 입력하세요");
            String payOption = sc.nextLine();
            if (payOption.equals("exit")) {
                System.out.println("프로그램 종료");
                return;
            }

            System.out.println("결제 금액 입력");
            int amount = sc.nextInt();
            sc.nextLine();

            payService.processPay(payOption, amount);
        }
    }
}
