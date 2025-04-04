package Stepdef2;


import io.cucumber.java.After;
import io.cucumber.java.Before;


public class hooks extends utilities.common_methods {
	
	@Before
	public void setup() {
		//System.out.println("before hooks");
		launch_chrome("https://demowebshop.tricentis.com/");
		login_step_1 l=new login_step_1();
		l.ll();
	}
	@After
	public void tear() {
		System.out.println("after method");
	}

}
