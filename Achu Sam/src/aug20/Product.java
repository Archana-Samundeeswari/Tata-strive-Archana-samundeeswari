package aug20;

public class Product {
	private String name;
	private double price;
	private int quantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void printProductDetails()
	{
		
		System.out.println("Name:"+getName());
		System.out.println("Price:"+price);
		System.out.println("Qty:"+quantity);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	public static void main(String[] args) {
		Product p1=new Product();
		p1.setName("HardDisk");
		p1.setPrice(6000);
		p1.setQuantity(10);
		
		//p1.printProductDetails();
		
		System.out.println(p1);
	}
}
