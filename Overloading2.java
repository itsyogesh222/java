package Final;

public class Overloading2 {

	
       public void showDetails(String name, int age) {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	   
	   public void showDetails(int age, String name) {
	        System.out.println("Age: " + age + ", Name: " + name);
	    }

	    public static void main(String[] args) {
	        Overloading2 obj = new Overloading2();
	        obj.showDetails("Yogesh", 21); 
	        obj.showDetails(21, "Yogesh"); 
	    }
	}


