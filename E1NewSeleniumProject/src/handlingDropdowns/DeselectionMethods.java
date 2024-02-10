package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Shree/OneDrive/Desktop/Elements/MultiSelect.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectDD);
		
		sel.selectByIndex(4);
		Thread.sleep(3000);
		sel.deselectByIndex(4);
		
		sel.selectByValue("v2");
		Thread.sleep(3000);
		sel.deselectByValue("v2");
		
		sel.selectByVisibleText("samosa");
		Thread.sleep(3000);
		sel.deselectByVisibleText("samosa");
		
		for(int i=0; i<=5; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(3000);
		}
		
		for(int j=0; j<=5; j++)
		{
			sel.deselectByIndex(j);
			Thread.sleep(3000);
		}
		
		
		
	}

}
