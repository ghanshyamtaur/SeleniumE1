package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=2d4dr4gevk6ik");
		Thread.sleep(2000);
		
		WebElement usnTextbox=driver.findElement(By.name("username"));
		usnTextbox.sendKeys("admin");
		Thread.sleep(2000);
		
		WebElement passTextbox=driver.findElement(By.name("pwd"));
		passTextbox.sendKeys("manager");
		Thread.sleep(2000);
		
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
	}

}
