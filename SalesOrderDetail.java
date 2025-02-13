package Final;

import java.util.Date;

public class SalesOrderDetail extends SalesOrder implements  AmountCalculator  {

	int productId;
    int quantity;
    double totalAmount;
    Date deliveryDate;
    
    public SalesOrderDetail(int id, String salesOrderId, Date dateOfOrder, double totalAmount, int userId,
			int productId, int quantity, double totalAmount2, Date deliveryDate) {
		super(id, salesOrderId, dateOfOrder, totalAmount, userId);
		this.productId = productId;
		this.quantity = quantity;
		totalAmount = totalAmount2;
		this.deliveryDate = deliveryDate;
	}

    @Override
    public void display() 
    
    {
        super.display();
        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Delivery Date: " + deliveryDate);
    }


	@Override
	public double calculateTotalAmount(int quantity, double sellPrice) {
		// TODO Auto-generated method stub
		return sellPrice * quantity;
	}

	

}
