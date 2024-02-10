package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		
		WebElement loginbutton= driver.findElement(By.name("loginBtn"));
		loginbutton.click();
		Thread.sleep(2000);
		
		WebElement emailtextbox=driver.findElement(By.id("Email"));
		emailtextbox.sendKeys("ghanshyamtaur120@gmail.com");
		Thread.sleep(2000);
		
		WebElement passtextbox = driver.findElement(By.id("Password"));
		passtextbox.sendKeys("Shyam@111");
		Thread.sleep(2000);
		
		WebElement loginbutton1= driver.findElement(By.id("Login"));
		loginbutton1.click();
		
		
		
		
		
	}

}
