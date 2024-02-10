package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloDragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/home");
		
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("username")).sendKeys("ghanshyamtaur120@gamil.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("Shyam@111");
		driver.findElement(By.id("login-submit")).click();
		
		WebElement sqlSrc = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement manualSrc = driver.findElement(By.xpath("//a[text()='Manual testing']"));
		WebElement apiSrc = driver.findElement(By.xpath("//a[text()='API testing']"));
		WebElement seleniumSrc = driver.findElement(By.xpath("//a[text()='Selenium']"));
		WebElement javaSrc = driver.findElement(By.xpath("//a[text()='JAVA']"));
		
		
		WebElement mockGivenTarget = driver.findElement(By.xpath("//h2[text()='Mock Given']"));
		WebElement mockPendingTarget = driver.findElement(By.xpath("//h2[text()='Mock pending']"));
		WebElement mockScheduleTarget = driver.findElement(By.xpath("//h2[text()='Mock Schedule']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sqlSrc, mockGivenTarget).perform();
		act.dragAndDrop(javaSrc, mockPendingTarget).perform();
		act.dragAndDrop(apiSrc, mockScheduleTarget).perform();
		act.dragAndDrop(manualSrc,mockGivenTarget).perform();
		act.dragAndDrop(seleniumSrc, mockScheduleTarget).perform();
		
		List<WebElement> options = driver.findElements(By.xpath("//button[@class='BppQGb2j7TfyB5 bxgKMAm3lq5BpA SEj5vUdI3VvxDc']"));
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		Thread.sleep(1000);
	}

}
