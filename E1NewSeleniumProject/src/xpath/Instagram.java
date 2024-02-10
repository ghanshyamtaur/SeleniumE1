
package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@ name='username']")).sendKeys("ghanshyam_taur_888");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ name='password']")).sendKeys("Shyam@111");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
	}

}
