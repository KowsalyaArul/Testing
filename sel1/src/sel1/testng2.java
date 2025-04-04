package sel1;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;
public class testng2 {
	private String browser;
	
	
	public testng2(String browser) {
		this.browser=browser;
	}
	@Test
	public void testMethod() {
		System.out.println("Running test on browser: "+ browser);
	}
	@Factory
	public static Object[] factoryMethod() {
		Object []bew= {
				new testng2("Chrome"),
				new testng2("Edge"),
				new testng2("Firefox")
		};
		return bew;
	}
}
