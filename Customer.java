public class Customer {
	
	private int CustomerID;
	private String CustomerName;
	private String Address;
	private int Phone;
	
	public Customer () {
		
	}
	public Customer (int id, String name, String address, int phone) {
		
		CustomerID=id;
		CustomerName=name;
		Address=address;
		phone=phone;
	}
	public void setCustonerID (int id) {
		CustomerID = id;
	}
	public int getCustomerID () {
		return CustomerID;
	}
	public void setCustomerName (String name) {
		CustomerName = name;
	}
	public String getCustomerName ()  {
		return CustomerName;
	}
	public void setAddress (String address) {
		Address = address;
	}
	public String getAddress () {
		return Address;
	}
	public void setPhone (int p) {
		Phone = p;
	}
	public int getPhone () {
		return Phone;
	}
}