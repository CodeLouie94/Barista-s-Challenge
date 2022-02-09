import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 2.5);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("drip coffee", 4.5);
        Item item4 = new Item("capuccino", 5.5);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.addItems(item1);
        order1.addItems(item2);
        Order order2 = new Order();
        order2.addItems(item3);
        order2.addItems(item4);
        Order order3 = new Order("Noah");
        order3.addItems(item4);
        order3.addItems(item1);
        Order order4 = new Order("Sam");
        order4.addItems(item1);
        order4.addItems(item2);
        Order order5 = new Order("Jin");
        order5.addItems(item2);
        order5.addItems(item4);


        // System.out.println(order1.getName());
        // System.out.println(order2.getName());
        // System.out.println(order3.getName());
        // System.out.println(order4.getName());
        // System.out.println(order5.getName());
        // order5.setReady(true);
        // System.out.println(order5.getReady());
        // System.out.println(order5.getTotal());
        System.out.println("##################################");

        order1.displayOrder();
        System.out.println("##################################");
        order2.displayOrder();
        System.out.println("##################################");
        order3.displayOrder();
        System.out.println("##################################");
        order4.displayOrder();
        System.out.println("##################################");
        order5.displayOrder();





    }
}
