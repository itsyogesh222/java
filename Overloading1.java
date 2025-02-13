package Final;

public class Overloading1 {


	    public void calculate(int a) {
	        System.out.println("Square: " + (a * a));
	    }

	  
	    public void calculate(double a) {
	        System.out.println("Square: " + (a * a));
	    }

	    public static void main(String[] args) {
	        Overloading1 obj = new Overloading1();
	        obj.calculate(4); 
	        obj.calculate(4.5); 
	    }
	}

