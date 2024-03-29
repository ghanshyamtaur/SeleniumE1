package handlingDropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Shree/OneDrive/Desktop/Elements/MultiSelect.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectDD);
		
		boolean result = sel.isMultiple();
		System.out.println(result);
		System.out.println();
		
		List<WebElement> options = sel.getOptions();
		
		for(int i=0; i<options.size(); i++)
		{
			String ops = options.get(i).getText();
			System.out.println(ops);
		}
		System.out.println();
		
		for(WebElement we:options)
		{
			String ops = we.getText();
			System.out.println(ops);
			
		}
		System.out.println();
		
		
	}

}
