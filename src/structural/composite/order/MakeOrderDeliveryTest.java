package structural.composite.order;

public class MakeOrderDeliveryTest {
    public static void main(String[] args) {
        Box bigBox = new Box(BoxSize.BIG);
        Box mediumBox = new Box(BoxSize.MEDIUM);
        Box smallBox = new Box(BoxSize.SMALL);
        Box smallBox2 = new Box(BoxSize.SMALL);

        // add to BIG BOX
        bigBox.add(new BoxItem("Iphone X", 20));
        bigBox.add(new BoxItem("Samsung Galaxy X", 15));

        // add to MEDIUM BOX which is inside BIG BOX
        mediumBox.add(new BoxItem("Macbook 16 Pro", 40));

        // add to SMALL BOX which is inside MEDIUM BOX
        smallBox.add(new BoxItem("Samsung Watch", 5));

        // add to SMALL BOX 2 which is inside MEDIUM BOX
        smallBox2.add(new BoxItem("Samsung Watch", 5));

        mediumBox.add(smallBox);
        mediumBox.add(smallBox2);
        bigBox.add(mediumBox);

        // Print all boxes and products
        bigBox.print();

        // Print total delivery price
        System.out.println("Total delivery price: " + bigBox.getDeliveryPrice());
    }
}
