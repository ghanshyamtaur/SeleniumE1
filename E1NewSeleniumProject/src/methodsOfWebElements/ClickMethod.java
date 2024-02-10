package methodsOfWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;jsessionid=nqa7p1t79ni5");

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

		WebElement loginbtn = driver.findElement(By.xpath("//a[text()='Login']"));
		loginbtn.click();
		driver.close();

	}

}
