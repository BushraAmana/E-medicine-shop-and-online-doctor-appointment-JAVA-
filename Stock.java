public class Stock {
	
	private int StockID;
	private int Quantity;
	private int shopNo;
	private Product []p= new Product [100];
	
	public Stock () {
		
	}
	public Stock (int id, int q, int no)  {
		StockID = id;
		Quantity = q;
		shopNo = no;
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
	public void setStockID (int id) {
		StockID = id;
	}
	public int getStockID () {
		return StockID;
	}
	public void setQuantity (int q) {
		Quantity = q;
	}
	public int getQuantity ()  {
		return quantity;
	}
	public void setShopNo (int no) {
		shopNo=no;
	}
	public int getShopNo ()  {
		return shopNo;
	}
}