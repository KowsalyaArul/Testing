 	package Stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps extends utilities.common_methods{
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	    
	    launch_chrome("https://www.saucedemo.com/");
	    System.out.println("The login page is displayed");
	}
	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		dr.get("https://www.saucedemo.com/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		dr.findElement(By.id("login-button")).click();
	    
	    
	}
	@Then("The product page is displayed")
	public void the_product_page_is_displayed() {
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(s, "Products");
	    
	}
	@When("User enter invalid username and password")
	public void user_enter_invalid_username_and_password() {
		dr.get("https://www.saucedemo.com/");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauc");
	}
	@Then("The product page will not be displayed")
	public void the_product_page_will_not_be_displayed() {
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(s, "Products");
	}
}
