package bst;
public class Order {
    
    
    int orderNum;
    String itemName;
    int quantity;
    double price;

    public Order(int orderNum, String itemName, int quantity, double price) {
        this.orderNum = orderNum;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Order Number: %d, Item Name: %s , Quantity: %d , Price: %.2f", orderNum, itemName,
                quantity, price);
    }


}
