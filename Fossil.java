package Final;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Fossil {

    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<SalesOrder> salesOrders = new ArrayList<>();
    static ArrayList<cart> cart = new ArrayList<>();

    public static void main(String[] args) {
        initializeData();
        Scanner scanner = new Scanner(System.in);

        User currentUser = userLogin(scanner);
        if (currentUser != null) {
            displayProducts();
            handleCartOperations(scanner);
            placeOrder(scanner);
        } else {
            System.out.println("Invalid username or password.");
        }
        scanner.close();
    }

    // Initialize sample data
    private static void initializeData() {
        users.add(new User(1, "Yogesh", "Yogesh@222", "9619233043", "13/17A Sai Krupa Chawl", "Mumbai", "Maharashtra", "India"));
        users.add(new User(2, "Anil", "Anil@123", "9004922600", "001 Alibagh", "Raigad", "Maharashtra", "India"));

        products.add(new Product(1, "Fossil Gen 6 Smartwatch", 1000.0, 2499.0, 15));
        products.add(new Product(2, "Fossil Hybrid HR", 2999.0, 4599.0, 11));
        products.add(new Product(3, "Fossil Men Brown Watch", 1599.0, 3999.0, 9));
    }

    // User Login
    private static User userLogin(Scanner scanner) {
    	
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
		return null;

       
    }

    // Display all products
    private static void displayProducts() {
        System.out.println("Available Products:");
        products.forEach(Product::display);
    }

    // Handle cart operations (add/view)
    private static void handleCartOperations(Scanner scanner) {
        while (true) {
            System.out.print("Enter product ID to add to cart or 'q' to quit: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) break;

            if (isValidProductId(input)) {
                int productId = Integer.parseInt(input);
                Product selectedProduct = findProductById(productId);
                if (selectedProduct != null) {
                    cart.add(new cart(1, selectedProduct.id)); // Assume user ID = 1
                    System.out.println("Product added: " + selectedProduct.name);
                } else {
                    System.out.println("Invalid product ID.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid product ID.");
            }
        }
        showCart();
    }

    // Check if the input is a valid product ID
    private static boolean isValidProductId(String input) {
        try {
            Integer.parseInt(input); // Try to parse the input as an integer
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Find product by ID
    private static Product findProductById(int productId) {
        return products.stream()
                .filter(product -> product.id == productId)
                .findFirst()
                .orElse(null);
    }

    // Display cart contents
    private static void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your Cart:");
            cart.forEach(c -> {
                Product product = findProductById(c.productId);
                if (product != null) product.display();
            });
        }
    }

    // Place order
    private static void placeOrder(Scanner scanner) {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Cannot place order.");
            return;
        }

        double totalAmount = cart.stream()
                .mapToDouble(c -> {
                    Product product = findProductById(c.productId);
                    return product.sellPrice * c.quantity;
                })
                .sum();


        String salesOrderId = "SO" + (salesOrders.size() + 1);
        SalesOrder salesOrder = new SalesOrder(salesOrders.size() + 1, salesOrderId, new Date(), totalAmount, 1);
        salesOrders.add(salesOrder);
        System.out.println("Order created: " + salesOrder.salesOrderId);

        System.out.print("Confirm order? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            cart.forEach(c -> {
             Product product = findProductById(c.productId);
             if (product != null) {
     new SalesOrderDetail(salesOrders.size(), salesOrderId, new Date(), product.sellPrice, 1, c.productId, 1,
                    product.sellPrice, new Date()).display();
                }
            });
            System.out.println("Order confirmed. Thank you for your purchase! totalAmount:+ totalAmount");
        } else {
            System.out.println("Order not confirmed.");
        }
    }
}
