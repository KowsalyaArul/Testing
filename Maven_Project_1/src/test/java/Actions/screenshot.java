package Actions;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		dr.manage().window().maximize();
		TakesScreenshot ss=((TakesScreenshot) dr);
		File srcf=ss.getScreenshotAs(OutputType.FILE);
		File destfile=new File("C:\\Users\\kowsalya.arulmathu\\Pictures\\1.png");
		FileUtils.copyFile(srcf, destfile);
	}

}
