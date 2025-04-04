package Stepdef2;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_step_1 extends utilities.common_methods {
	public void ll() {
		dr.findElement(By.className("ico-login")).click();
	}
	@When("^enter \"(.*)\" and \"(.*)\"$")
	public void enter_email_and_password(String e,String p) {		
	
		dr.findElement(By.name("Email")).sendKeys(e);
		dr.findElement(By.name("Password")).sendKeys(p);
	}
	@When("click login button")
	public void click_login_button() {
		dr.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    
	}
	@Then("^username display \"(.*)\"$")
	public void username_display_at_homepage(String m) {
		if(m.equals("v3m@gmail.com")) {
			String str = dr.findElement(By.xpath("//a[@href='/customer/info' and contains(@class, 'account')]")).getText();
			Assert.assertEquals(str, m);
			}
			else if(m.contains("Login was unsuccessful")) {
				String str = dr.findElement(By.xpath("//div[@class='validation-summary-errors']/span")).getText();
				Assert.assertEquals(str, m);
			}
		
	    
	}

}
