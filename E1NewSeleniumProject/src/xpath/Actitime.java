package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do;jsessionid=nqa7p1t79ni5");
    Thread.sleep(3000);
     
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//a[text()='Login']")).click();
    driver.close();
    
	}

}
