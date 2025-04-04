package prrj1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders1 {
	@DataProvider(name="testdata")
	public  Object[] getdata() {
		Object[][] testdata = new Object[][] {
								{"user1","pwd2"},
								{"user2","pwd3"},
								{"user1","pwd3"}
			
			};
		return testdata;
		
	}
	@Test(dataProvider="testdata")
	public void test(String uid,String pwd) {
		System.out.println("User id : "+ uid+" Password : "+ pwd);
	}

}
