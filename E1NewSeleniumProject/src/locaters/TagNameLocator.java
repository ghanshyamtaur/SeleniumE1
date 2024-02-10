package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/OneDrive/Desktop/Elements/Textbox.html");
		Thread.sleep(2000);
		
	WebElement textbox =driver.findElement(By.tagName("input"));//Find password textfield on webpage
	textbox.sendKeys("manager");//Pass the inputs to password textfield
	
	
	//Note: Inputs are passed to username textfield it is the 1st element designed
	//        with input tag.
	}

}

