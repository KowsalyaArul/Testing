package sel1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class testng1 {
	 @Test
	  public void f1() {
		  System.out.println("test2");
	  }
	 @AfterClass
	  public void after() {
		  System.out.println("After");
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod");
  }
  @Test
  public void f() {
	  System.out.println("test1");
  }
 

}
