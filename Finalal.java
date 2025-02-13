package Final;

import java.util.ArrayList;

public class Finalal {

	
	    public static void main(String[] args) {
	    
	        ArrayList<Product11> products = new ArrayList<>();

	    
	        products.add(new Product11(1, "Laptop", "Lenovo", 150000.00));
	        products.add(new Product11(2, "Phone", "Iphone", 90000.00));
	        products.add(new Product11(3, "Headphones", "Boat", 30000.00));

	       System.out.println("Product List");
	       
	        
	     products.forEach(product -> product.display());

	}

}
