package prrj1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderss {
	@DataProvider(name="testdata")
	public  Object[] getdata() {
		Object[] testdata = new Object[] {"user1","user2","user3"};
		return testdata;
		
	}
	@Test(dataProvider="testdata")
	public void test(String uid) {
		System.out.println("User id : "+ uid);
	}

}
