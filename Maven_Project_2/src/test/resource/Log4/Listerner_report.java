package Log4;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
@Listeners(Listerner2.class)
public class Listerner_report {
	@Test
	public void test1()
	{
		Reporter.log("Executing test1");
		Assert.assertTrue(true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Executing test1");
		Assert.assertTrue(false);
	}

}
