package Final;

public class User {

	 int id;
     String name;
     String password;
     String phoneNo;
     String address;
     String city;
     String state;
     String country;
     
     public User(int id, String name, String password, String phoneNo,
    		 String address, String city, String state,String country)
     {
    	 this.id = id;
 		this.name = name;
 		this.password = password;
 		this.phoneNo = phoneNo;
 		this.address = address;
 		this.city = city;
 		this.state = state;
 		this.country = country; 

     }
     
     public void display() 
 	{
 	        System.out.println("User ID: " + id);
 	        System.out.println("Name: " + name);
 	        System.out.println("Phone Number: " + phoneNo);
 	        System.out.println("Address: " + address);
 	        System.out.println("City: " + city);
 	        System.out.println("State: " + state);
 	        System.out.println("Country: " + country);



 	}
}
