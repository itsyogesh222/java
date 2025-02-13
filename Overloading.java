package Final;

public class Overloading {

	public void display(String name) {  
	        System.out.println("Name: " + name);  
	    }  

	 
	    public void display(String name, int age) {  
	        System.out.println("Name: " + name + ", Age: " + age);  
	    }  

	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        Overloading obj = new Overloading();  
	        obj.display("Yogesh");  
	        obj.display("Yogesh", 21);  
	    }  
	}


