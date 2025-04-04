package Junits;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FlipkartMain {
	 public static  HashMap<Integer, Flip> productMap = new HashMap<>();
    public static void main(String[] args) {

      
        Scanner sc = new Scanner(System.in);

        Flip f1 = new Flip(10, "Kurtis", 18000, "Dior", 3);
        Flip f2 = new Flip(11, "Watches", 250, "Titan", 20);
        Flip f3 = new Flip(12, "Waterbottle", 50, "Milton", 15);
        Flip f4 = new Flip(13, "Phones", 2500, "Oneplus", 88);
        Flip f5 = new Flip(14, "Bags", 500, "Tourist", 42);
        Flip f6 = new Flip(15, "Shoes", 780, "Sneekers", 55);
        Flip f7 = new Flip(16, "Cases", 100, "Samsung", 89);
        Flip f8 = new Flip(17, "Jean", 250, "Kotty", 73);
        Flip f9 = new Flip(18, "Leggings", 250, "Prisma", 15);
        Flip f10 = new Flip(19,"Shirt", 350, "Allan", 3);
        
        productMap.put(f1.product_id, f1);
        productMap.put(f2.product_id, f2);
        productMap.put(f3.product_id, f3);
        productMap.put(f4.product_id, f4);
        productMap.put(f5.product_id, f5);
        productMap.put(f6.product_id, f6);
        productMap.put(f7.product_id, f7);
        productMap.put(f8.product_id, f8);  
        productMap.put(f9.product_id, f9);
        productMap.put(f10.product_id, f10);
        

        FlipFunct billingSystem = new FlipFunct(productMap);

        while (true) {
            System.out.println("\n1: Display Products");
            System.out.println("2: Purchase product");
            System.out.println("3: Generate Bill");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    FlipFunct.displayProducts();
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int productId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    Flip purchasedItem = FlipFunct.purchaseProduct(productId, quantity);
                    if (purchasedItem != null) {
                        FlipFunct.addToBill(purchasedItem);
                        System.out.println("Product added to bill.");
                    }
                    break;

                case 3:
                    FlipFunct.generateBill();
                    break;

                case 4:
                    System.out.println("Exit");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}