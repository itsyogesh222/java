package Final;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Produ {

    int id;
    String name;
    double price;

   
    public Produ(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

      public static void main(String[] args) {
     List<Produ> products = new ArrayList<>();

    
        products.add(new Produ(1, "Laptop", 120000.00));
        products.add(new Produ(2, "Phone", 80000.00));
        products.add(new Produ(3, "Headphones", 30000.00));

    
      double totalPrice = products.stream().collect(Collectors.summingDouble(p -> p.price));
        System.out.println("Total Price of All Products: " + totalPrice);
    }
}
