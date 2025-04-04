package Hashmap;

public class Flip {
	public int product_id;
	public String product_name;
	public int price;
	public String brand;
	public int quantity;
	
	public Flip(int product_id,String product_name,int price,String brand,int quantity) {
		this.product_id=product_id;
		this.product_name=product_name;
		this.price=price;
		this.brand=brand;
		this.quantity=quantity;
	}
	public void display() {
		System.out.println(" Id : "+ product_id
    			+ "\n Name : "+ price
    			+ "\n Brand : "+ brand
    			+ "\n Quantity : "+ quantity+"\n");
    	
	}
	
}
