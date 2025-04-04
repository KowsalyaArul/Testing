package Stepdef2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class add_to_cart<WebElement> extends utilities.common_methods {
	@When("select book categoreies")
	public void click_login_button() {
		dr.findElement(By.xpath("//ul[@class='list']//a[@href='/books']")).click();
	    
	}
	@When("products1 add to cart")
	public void products1_add_to_cart ()throws InterruptedException {
		dr.findElement(By.xpath("//div[@class='block block-category-navigation']/div/ul/li/a[@href='/books']")).click();
		dr.findElement(By.xpath("//div[@class='product-grid']/div[1]/div[1]/div[2]//input")).click();	
		Thread.sleep(1000);
		dr.findElement(By.xpath("//div[@class='product-grid']/div[3]/div[1]/div[2]//input")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("//div[@class='product-grid']/div[5]/div[1]/div[2]//input")).click();
	}
	@When("add products to cart")
	public void add_products_to_cart() {
		dr.findElement(By.xpath("//*[@id=\"bar-notification\"]/p/a")).click();
		String m=dr.findElement(By.xpath("//div[@class='order-summary-content']//a[@href='/computing-and-internet']")).getText();
		Assert.assertEquals(m, "Computing and Internet");
		String n=dr.findElement(By.xpath("//div[@class='order-summary-content']//a[@href='/fiction']")).getText();
		Assert.assertEquals(n, "Fiction");
		 
	}
	@When("to delete the product in cart")
	public void to_delete() {
		dr.findElement(By.xpath("//table/tbody/tr[1]/td[1]/input")).click();
		dr.findElement(By.xpath("//div[@class='order-summary-content']/form/div[1]//input[1]")).click();
	}
	@When("to check the total")
	public void to_check_total() {
		dr.findElement(By.xpath("//table[@class='cart-total']/tbody/tr[1]/td[2]/span/span")).click();
		String s=dr.findElement(By.xpath("//table[@class='cart-total']/tbody/tr[1]/td[2]/span/span")).getText();
		int num=(int) Double.parseDouble(s);
		Assert.assertEquals(num, 34.0);
	}
	@When("to add the quantity")
	public void to_add() {
		dr.findElement(By.xpath("//table[@class ='cart']/tbody/tr[1]/td[5]/input")).clear();
		dr.findElement(By.xpath("//table[@class ='cart']/tbody/tr[1]/td[5]/input")).sendKeys("3");
		dr.findElement(By.xpath("//div[@class='order-summary-content']/form/div[1]//input[1]")).click();
		String k=dr.findElement(By.xpath("//tbody/tr[1]/td[6]/span[2]")).getText();
		double num=Double.parseDouble(k);
		Assert.assertEquals(num, 72.0);
		 
	}
	@When("to check the subtotal")
	public void sub_tot() {
		String s=dr.findElement(By.xpath("//table[@class='cart-total']/tbody/tr[1]/td[2]/span/span")).getText();
		double num= Double.parseDouble(s);
		Assert.assertEquals(num, 82.0);
		
	}
	@When("to checkout")
	public void total() {
		dr.findElement(By.xpath("//input[@id='termsofservice']")).click();
		dr.findElement(By.xpath("//button[@type ='submit']")).click();
		
	}
	/*@When("after checkout")
	public void after_checkout() throws InterruptedException{
		WebElement we2 = (WebElement) dr.findElement(By.id("BillingNewAddress_CountryId"));
		Select sel2 = new Select((org.openqa.selenium.WebElement) we2);
		sel2.selectByContainsVisibleText("India");
		dr.findElement(By.id("BillingNewAddress_City")).sendKeys("DH");
		dr.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Harur");
		dr.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("636905");
		dr.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("6381651897");
		
		
	}*/
	@When("Adding click")
	public void adding() throws InterruptedException {
	dr.findElement(By.xpath("//div[@id='checkout-step-billing']/div/input")).click();
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[@id='checkout-step-shipping']/div/input")).click();
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/input")).click();
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[@id='payment-method-buttons-container']/input")).click();
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input")).click();
	Thread.sleep(1000);
	dr.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/input")).click();
	Thread.sleep(1000);
	
	}
	
	@Then("Order completion")
	public void order_complete() throws InterruptedException {
		
		Thread.sleep(3000);
		String order = dr.findElement(By.xpath("//div[@class='section order-completed']/ul/li[1]")).getText().trim().toLowerCase();
		dr.findElement(By.xpath("//div[@class='section order-completed']/div/input")).click();
		
		dr.findElement(By.className("account")).click();
		dr.findElement(By.xpath("//div[@class='block block-account-navigation']/div[2]/ul/li[3]/a")).click();
		String find = dr.findElement(By.xpath("//div[@class='order-list']/div[1]/div/strong")).getText().trim().toLowerCase();
		Assert.assertEquals(order, find);
		
		
	}

}