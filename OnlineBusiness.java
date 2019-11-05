import java.util.Scanner;

public class OnlineBusiness {
	
	public static void main (String arg[])  {
		  Customer c1 = new Customer (1243, "Mahbub Hasan", "Bashundhara", 01712637236);
		  Order o1 = new Order (16354, 27635, 26534, 3000);
		  Product p1 = new Product (15423, (float)115.99, "Brush");
		  o1.addProduct (p1);
		  System.out.println("Custoner name : "+c1.getCustomerName());
		  System.out.println("Custoner Id : "+c1.getCustomerID());
		  System.out.println("Custoner Address : "+c1.getAddress());
		  System.out.println("Custoner name : "+c1.getCustomerName());
		  System.out.println("Product Type : "+p1.getProductType ());

	}
}