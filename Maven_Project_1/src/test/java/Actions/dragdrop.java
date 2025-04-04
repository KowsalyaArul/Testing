package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new EdgeDriver();
		dr.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
		dr.manage().window().maximize();
		WebElement w1=dr.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement w2=dr.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act=new Actions(dr);
		act.dragAndDrop(w1, w2).perform();
		

	}

}
