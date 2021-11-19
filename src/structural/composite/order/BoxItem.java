package structural.composite.order;

public class BoxItem extends BoxComposite {
    private final String product;
    private final double deliveryPrice;

    public BoxItem(String product, double deliveryPrice) {
        this.product = product;
        this.deliveryPrice = deliveryPrice;
    }

    @Override
    public String getName() {
       return product;
    }

    @Override
    public void print() {
        System.out.println("Product: " + product);
    }

    @Override
    public double getDeliveryPrice() {
       return deliveryPrice;
    }
}
