public class Product {
	 
	 public int ProductID;
	 public float ProductPrice;
	 public String ProductType;
	 
	 public Product () {
		 
	 }
	 public Product (int id, float price, String type) {
		  
		  ProductID = id;
		  ProductPrice = price;
		  ProductType = type;
	 }
	 public void setProductID (int id)  {
		  this.ProductID = id;
	 }
     public float getProductID () {     
		  return ProductID; 
     }
	 public void setProductType (String type) {
		  ProductType = type;
	 }
	 public String getProductType () {
		 return ProductType;
	 }
}