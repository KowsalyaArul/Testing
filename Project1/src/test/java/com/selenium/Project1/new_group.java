package com.selenium.Project1;

import org.testng.annotations.Test;

public class new_group {
	@Test(groups= {"F1","F2"})
	public void t() {
		System.out.println("Executing F1 and F2");
	}
	@Test(groups= {"F1"})
	public void rt() {
		System.out.println("Executing F1");
	}
	@Test(groups= {"F2"})
	public void t1() {
		System.out.println("Executing  F2");
	}
	@Test(groups= {"F1"})
	public void rt1() {
		System.out.println("Executing F1");
	}

}
