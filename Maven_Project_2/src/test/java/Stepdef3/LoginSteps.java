package Stepdef3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ScenarioContext;
import utilities.TestContext;

public class LoginSteps extends utilities.common_methods {
	TestContext tContext;
	@Given("The login page is displayed")
	public void login_page_is_displayed() {
	    
	    launch_chrome("https://www.saucedemo.com/");
	    System.out.println("The login page is displayed");
	     tContext = new TestContext();
	}
	@When("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_valid_user_pass(String uid,String pwd) {
		tContext.set(ScenarioContext.USERNAME.toString(),uid);
		tContext.set(ScenarioContext.SESSION_TOKEN.toString(),"asd789");
	}
	@Then("user session should be available")
	public void verify_user_session() {
		String storeduid=(String) tContext.get(ScenarioContext.USERNAME.toString());
		String sessionToken=(String) tContext.get(ScenarioContext.SESSION_TOKEN.toString());
		
		System.out.println(" storeduid : " + storeduid + "\n sessionToken : "+sessionToken);
	}

}
