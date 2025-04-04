package Junits;

import java.util.*;

public class FlipFunct  {
    public static HashMap<Integer, Flip> productMap;
    public static List<Flip> purchasedItems = new ArrayList<>();
	public Object product_id;

    public FlipFunct(HashMap<Integer, Flip> productMap) {
        FlipFunct.productMap = productMap;
    }

    public FlipFunct() {
		// TODO Auto-generated constructor stub
	}

	public static void displayProducts() {
        System.out.println("\n Available Products:");
        for (Flip product : productMap.values()) {
            product.display();
        }
    }

    public static Flip purchaseProduct(int productId, int quantity) {
        if (!productMap.containsKey(productId)) {
            System.out.println("Invalid Product ID.");
            return null;
        }

        Flip product = productMap.get(productId);

        if (product.quantity < quantity) {
            System.out.println("Insufficient stock.");
            return null;
        }

        product.quantity -= quantity;
        return new Flip(product.product_id, product.product_name, product.price, product.brand, quantity);
    }

    public static void addToBill(Flip product) {
        purchasedItems.add(product);
    }

    public static void generateBill() {
        int totalAmount = 0;

        System.out.println("\n===== BILL =====");
        for (Flip product : purchasedItems) {
            int itemTotal = product.price * product.quantity;
            System.out.println(product.product_name + " | Unit Price: " + product.price +
                    " | Qty: " + product.quantity + " | Total: " + itemTotal);
            totalAmount += itemTotal;
        }
        System.out.printf("\nTotal Amount: Rs.\n", totalAmount);
        if(totalAmount>=2000 && totalAmount<5000) {
        	System.out.println("Congralation!!!! Your purchase is eligible for 10% discount");
        	int percent=10;
        	double cost=Costtopay(totalAmount,percent);
        	System.out.println("Amount To Pay: $" + cost);
        	 System.out.println("==============================================");
        }else if(totalAmount>=5000 && totalAmount<10000) {
        	System.out.println("Congralation!!!! Your purchase is eligible for 15% discount");
        	int percent=15;
        	double cost=Costtopay(totalAmount,percent);
        	System.out.println("Amount To Pay: $" + cost);
        	 System.out.println("==============================================");
        }else if(totalAmount>=10000 && totalAmount<20000) {
        	System.out.println("Congralation!!!! Your purchase is eligible for 20% discount");
        	int percent=20;
        	double cost=Costtopay(totalAmount,percent);
        	System.out.println("Amount To Pay: $" + cost); 
        	System.out.println("==============================================");
        }else if(totalAmount>=20000) {
        	System.out.println("Congralation!!!! Your purchase is eligible for 25% discount");
        	int percent=25;
        	double cost=Costtopay(totalAmount,percent);
        	System.out.println("Amount To Pay: $" + cost);
        	
        }else {
        	System.out.println(" You are so near to have a discount.\n For 2000 to 5000 purchases, there is the 10% discount. \n For 5000 to 10000 purchase, there is 15% discount."
        		+" \nFor 10000 to 20000 purchase, there is 20% discount. \n For more than 20000 purchase, there is 25% discount.");
        }
        
    }
    public static double Costtopay(int totalAmount, int percent) {
    	
    	double discount = (totalAmount*percent)/100;
        double costToPay = totalAmount-discount;
        return costToPay;
    }
       
    }

    
