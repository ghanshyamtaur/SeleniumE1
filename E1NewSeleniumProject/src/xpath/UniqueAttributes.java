package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttributes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(9000); 
		
		//WebElement signlink= driver.findElement(By.partialLinkText("Sign In"));
		//signlink.click();
		//Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("ghanshyamtaur111@gmail.com");
		Thread.sleep(5000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='mui-2']"));
		pass.sendKeys("Shyam@111");
		Thread.sleep(5000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		
		
	}

}
