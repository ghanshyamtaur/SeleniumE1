package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chat.qspiders.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ghanshyamtaur120@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("patil111");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@type='submit'  and @class='rs-btn rs-btn-default']")).click();
		driver.close();

	}

}
