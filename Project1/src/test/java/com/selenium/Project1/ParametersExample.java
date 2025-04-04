package com.selenium.Project1;

import org.testng.annotations.Test;

//import com.testng.annotations.Parameters;

public class ParametersExample {
	@Test
	//@Parameters({"OS"})
	public void testWithParameters(String OS) {
		System.out.println("Running test on Os : "+ OS);
	}
	

}
