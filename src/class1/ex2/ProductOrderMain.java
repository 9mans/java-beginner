package class1.ex2;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder order1 = new ProductOrder();
        order1.name = "컴퓨터";
        order1.price = 500000;
        order1.amount = 2;

        ProductOrder order2 = new ProductOrder();
        order2.name = "라디오";
        order2.price = 100000;
        order2.amount = 1;

        ProductOrder order3 = new ProductOrder();
        order3.name = "TV";
        order3.price = 1000000;
        order3.amount = 1;

        ProductOrder[] orders = {order1, order2, order3};

        int totalAmount = 0;
        for (ProductOrder amount : orders) {

            System.out.println("상품이름: " + amount.name + " 가격: " + amount.price + " 수량: " + amount.amount);
            totalAmount += amount.price * amount.amount;
        }
        System.out.println("전체가격:" + totalAmount);
    }
}
