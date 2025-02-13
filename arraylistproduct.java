package Final;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class productt {
    int id;
    String name;
    String brand;
    double price;

   
    public productt(int id, String name, String brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }


	public Object display() {
		// TODO Auto-generated method stub
		return null;
	}

  
   
}

public class arraylistproduct {

    public static void main(String[] args) {

        ArrayList<productt> products = new ArrayList<>();

        
        products.add(new productt(1, "Laptop", "Dell", 1200.00));
        products.add(new productt(2, "Phone", "Samsung Galaxy S23", 300.00));
        products.add(new productt(3, "Headphones", "Sony", 3000.00)); 
      

       
        System.out.println("Product List:");
        products.forEach(p -> p.display());

     
        double totalPrice = products.stream().filter(p -> p.price > 400).collect(Collectors.summingDouble(p -> p.price)); 

     
        System.out.println("Total Price of Products with Price: " + totalPrice);

       
       }
}
