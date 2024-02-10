package handlingDropdowns;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicates {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Shree/OneDrive/Desktop/Elements/MultiSelect.html");
		
		WebElement multiselectDD=driver.findElement(By.id("menu"));
		Select sel = new Select(multiselectDD);
		TreeSet<String> ts = new TreeSet<String>();
		List<WebElement> options = sel.getOptions();
		for(WebElement we:options)
		{
			String textToinsert = we.getText();
			ts.add(textToinsert);
			
		}
		
		for (String text:ts)
		{
			System.out.println(text);
		}
	}

}
