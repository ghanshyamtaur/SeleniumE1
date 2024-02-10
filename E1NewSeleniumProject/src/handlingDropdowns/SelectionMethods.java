package handlingDropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Shree/OneDrive/Desktop/Elements/SingleSelect.html");
		
		WebElement singleSelectDD=driver.findElement(By.id("menu"));
		Select sel = new Select(singleSelectDD);
		
		sel.selectByIndex(0);
		Thread.sleep(3000);
		
		sel.selectByValue("v6");
		Thread.sleep(3000);
		
		sel.selectByVisibleText("samosa");
		Thread.sleep(3000);
		
				
		
	}

}
