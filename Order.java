public class Order {
	
	 private int OrderID;
	 private int CustomerID;
	 private int ProductID;
	 private int Amount;
	 private Product p[] = new Product [100];
	 
	 public Order () {
		 
	 }
	 public Order (int oid, int cid, int pid, int amount) {
		  OrderID = oid;
		  CustomerID = cid;
		  ProductID = pid;
		  Amount = amount;
	 }
	 public void addProduct (Product newP) {
		 for (int i=0;i<100;i++) {
			 if (p[i]==null) {
				 p[i] = newP;
				 break;
			 }
		 }
	 }
	 public Product getProduct (int i)  {
		 return p[i];
	 }
	 public void setOrderID (int oid) {
		  OrderID = oid;
	 }
	 public int getOrderID () {
		 return OrderID;
	 }
	 public void setCustomerID (int id) {
		 CustomerID = id;
	 }
	 public int getCustomerID () {
		 return CustomerID;
	 }
	 public void setProductID (int id) {
		 ProductID = id;
	 }
	 public int getProductID () {
		 return ProductID;
	 }
	 public void setAmount (int amount) {
		 Amount = amount;
	 }
	 public int setAmount ()  {
		 return Amount;
	 }
}