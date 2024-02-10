package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppesstack {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='navbar_Loginbutton__8r9bE']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("ghanshyamtaur120@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Shyam@111");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		//driver.close();
		

	}

}
