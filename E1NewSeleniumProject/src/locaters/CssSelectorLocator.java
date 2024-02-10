package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000); 
		
		WebElement usnTB=driver.findElement(By.cssSelector("input[aria-label*='Phone numb']"));
		usnTB.sendKeys("ghanshyam_taur_888");
		
		WebElement pwdTB=driver.findElement(By.cssSelector("input[aria-label*='Paswd']"));
		pwdTB.sendKeys("Shyam@111");
		
		WebElement btn=driver.findElement(By.cssSelector("button[type*='smit']"));
		btn.click();
		driver.close();
		
		
	}

}
