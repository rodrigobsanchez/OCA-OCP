package OCA.Chapter1;

/**
 * prints:
 * setting field
 * setting contructor
 * Tiny
 */
public class OrderOfInitialization {
    private String name = "Fluffy";
    {
        System.out.println("setting field");
    }
    public OrderOfInitialization(){
        name = "Tiny";
        System.out.println("setting contructor");
    }

    public static void main(String[] args) {
        OrderOfInitialization order = new OrderOfInitialization();
        System.out.println(order.name);
    }
}
