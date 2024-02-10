package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class ByBrowserSpecificClass {

	public static void main(String[] args) throws IOException {
		
		
		ChromeDriver driver=new ChromeDriver();//To store the refernce with ChromeDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);//To take screenshot of webpage
		
		File dest = new File("./screenshots/facebook.png");//to specify the location, name, extension of screenshot
		
		Files.copy(src, dest);//To copy and paste the screenshot in the specified folder
		
	}

}
