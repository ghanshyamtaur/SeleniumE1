package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSingup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayDD = driver.findElement(By.id("day"));
		WebElement monthDD = driver.findElement(By.id("month"));
		WebElement yearDD = driver.findElement(By.id("year"));
		
		Select daysel = new Select(dayDD);
		boolean result1 = daysel.isMultiple();
		System.out.println("dayDD is multiple ? :"+result1);
		
		List<WebElement> dayOptions = daysel.getOptions();
		for( WebElement we:dayOptions)
		{
			System.out.println(we.getText());
			
		}
		
		daysel.selectByIndex(18);
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println();
		
		Select monthSel = new Select(monthDD);
		boolean result2 = monthSel.isMultiple();
		System.out.println("monthDD is multiple ?:"+result2);

		List<WebElement> monthOptions = monthSel.getOptions();
		for( WebElement we:monthOptions)
		{
			System.out.println(we.getText());
		}
		monthSel.deselectByIndex();
		
		
	}

}
