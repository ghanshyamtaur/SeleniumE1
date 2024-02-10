package methodsOfWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Point targetPoint = new Point(100,50);// To pass x and y co-ordinates
		driver.manage().window().setPosition(targetPoint);// TO pass the co-ordinated to setPosition method

	}

}
