package ref.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = createOrder("컴퓨터", 200000, 1);
        productOrders[1] = createOrder("라디오", 100000, 2);
        productOrders[2] = createOrder("tv", 1000000, 3);

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