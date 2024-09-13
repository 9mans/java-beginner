package ref.ex;

import java.util.Scanner;

public class ProductOrderMain1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수: ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < productOrders.length; i++) {

            System.out.println((i+1) + "번 째 주문을 입력하세요");

            System.out.println("상품명");
            String name = sc.nextLine();
            System.out.println("가격");
            int price = sc.nextInt();
            System.out.println("수량");
            int quantity = sc.nextInt();
            sc.nextLine();

            productOrders[i] = createOrder(name, price, quantity);
        }

        printOrder(productOrders);
        int totalAmount = getTotalAmount(productOrders);

        System.out.println("총 가격:" + totalAmount);

    }

    static ProductOrder createOrder(String name, int price, int quantity) {

        ProductOrder productOrder = new ProductOrder();
        productOrder.name = name;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrder(ProductOrder[] productOrders) {

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.name + " 가격: " + productOrder.price + " 수량: " + productOrder.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {

        int getTotalAmount = 0;

        for (ProductOrder productOrder : productOrders) {
            getTotalAmount += productOrder.price * productOrder.quantity;
        }
        return getTotalAmount;
    }
}