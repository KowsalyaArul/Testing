package Stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps_2 extends utilities.common_methods {
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enter_valid_username_and_password(String uid,String pwd) {
		dr.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uid);
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
	}
	
	
	@Then("^The application should display the message \"(.*)\"$")
	public void The_application_should_display_the_message(String msg) {
		if(msg.equals("Products")) {
			String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(s, msg);
		}
		else if(msg.equals("Epic sadface: Username and password do not match any user in this service")) {
			String s2 = dr.findElement(By.xpath("//div[@class='error-message-container error']//h3[@data-test='error']")).getText();
			Assert.assertEquals(s2, msg);
		}
		
	  
	}
	 

}
