import java.util.Scanner;

public class Store {
    private BigWarehouse warehouse;
    private Scanner scanner;

    public Store(BigWarehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();

            if (product.isEmpty()) {
                break;
            }
            int price = this.warehouse.price(product);
            cart.add(product, price);
            this.warehouse.take(product);

        }

        System.out.println("your shopping cart contents");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}