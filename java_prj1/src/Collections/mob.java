package Collections;
import java.util.ArrayList;
public class mob {
	public String brand;
	public String model;
	public int price;
	public int ram;
	public mob(String brand,String model,int price,int ram) {
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.ram=ram;
	}
	public void find_mobile(String brandname,ArrayList<mob> mbl) {
		for(mob i:mbl) {
			if(i.brand==brandname)
				 System.out.println(" Brand : "+ i.brand
			    			+ "\n Model : "+ i.model
			    			+ "\n Price : "+ i.price
			    			+ "\n RAM : "+i.ram+ "\n");
			
		}
		System.out.println("-----------------------------------------------------------------");
		
	}
	public void dis_mobile(int p1,int p2,ArrayList<mob> mbl) {
		for(mob j:mbl) {
		if((j.price>=p1)&&(j.price<=p2))
			System.out.println(" Brand : "+ j.brand
	    			+ "\n Model : "+ j.model
	    			+ "\n Price : "+ j.price
	    			+ "\n RAM : "+j.ram+ "\n");
	}
	   System.out.println("-----------------------------------------------------------------");
	}
	public void dis_details(int r,int p,ArrayList<mob> mbl) {
		for(mob k:mbl) {
			if((k.ram>r)&&(k.price<p)) 
				System.out.println(" Brand : "+ k.brand
		    			+ "\n Model : "+ k.model
		    			+ "\n Price : "+ k.price
		    			+ "\n RAM : "+k.ram+ "\n");
			}
			 System.out.println("-----------------------------------------------------------------");
		
	}
	public mob() {
		
	}
	
	}


