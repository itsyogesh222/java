package Final;

import java.util.Date;

public class SalesOrder {

	int id;
    String salesOrderId;
    Date dateOfOrder;
    double totalAmount;
    int userId;

   public SalesOrder(int id, String salesOrderId, Date dateOfOrder, double totalAmount, int userId) 
	
	{

		this.id = id;
		this.salesOrderId = salesOrderId;
		this.dateOfOrder = dateOfOrder;
		this.totalAmount = totalAmount;
		this.userId = userId;
	}
   
   public void display()
	 
	 {
	        System.out.println("Sales Order ID: " + salesOrderId);
	        System.out.println("Order ID: " + id);
	        System.out.println("Date of Order: " + dateOfOrder);
	        System.out.println("Total Amount: " + totalAmount);
	        System.out.println("User ID: " + userId);
	 }


}
