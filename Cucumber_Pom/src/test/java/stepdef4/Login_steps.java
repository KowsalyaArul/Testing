package stepdef4;

import org.testng.Assert;

import Pom.pages.login_page;
import Pom.pages.product_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.base_class;

public class Login_steps extends base_class{
	login_page lp;
	@Given("Login page should is displayed")
	public void login_page_should_is_displayed() {
		launch_chrome("https://www.saucedemo.com/");
	    System.out.println("The login page is displayed");
	}
	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password() {
		lp=new login_page(dr);
		lp.enter_uname("standard_user");
		lp.enter_pwd("secret_sauce");
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    lp.click_login();
	}
	product_page pp;
	@Then("The product page is displayed")
	public void the_product_page_is_displayed() {
		pp=new product_page(dr);
	  String p1=pp.get_title();
	  Assert.assertEquals(p1, "Products");
	}


}
