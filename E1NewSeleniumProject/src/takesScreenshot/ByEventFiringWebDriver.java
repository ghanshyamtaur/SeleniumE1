package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriver {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();//To upcast to WebDriver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/");
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);//To create object of EventFiringWebDriver with chrome driver class
		
		File src = efwd.getScreenshotAs(OutputType.FILE);//To take screenshot of webpage
		
		File dest = new File("./screenshots/instagram.png");//to specify the location, name, extension of screenshot
		
		Files.copy(src, dest);//To copy and paste the screenshot in the specified folder
		
		
	}

}
