package sel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testsuite1 {
@Test
public void test()
{
	WebDriver dr = new ChromeDriver();
	dr.get("https://demowebshop.tricentis.com/");
	
}
}
