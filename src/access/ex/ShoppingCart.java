package access.ex;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {

        if (itemCount >= items.length) {
            System.out.println("장바구니 초과");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems() {

        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + " 합계: " + item.getTotalPrice());
        }
        System.out.println("총 계산 금액" + totalPrice());
    }

    private int totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item[] items1 = items;
            totalPrice += items1[i].getTotalPrice();
        }
        return totalPrice;
    }
}
