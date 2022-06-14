package KeyboardOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class operation1 {
	public static void main(String[] args) throws InterruptedException {
		//String path = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver",path);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//	driver.findElement(By.cssSelector("Body")).sendKeys(Keys.ESCAPE);		
		WebElement element = driver.findElement(By.xpath("//body"));
		element.sendKeys(Keys.ESCAPE);
		for (int i = 0; i < 10; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);
	}
}
}