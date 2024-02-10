package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// To launch chrome browser
		
		driver.navigate().to("https://www.flipkart.com/"); //To launch the web apk 
		Thread.sleep(1000);
		
		driver.navigate().back(); //To navigate backward
		
		Thread.sleep(1000);
		
        driver.navigate().forward(); //To navigate forward
        
        Thread.sleep(1000);
        
        driver.navigate().refresh(); //To refresh
        
        driver.close();

	}

}
