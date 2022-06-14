package BrowserOperations2;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	//	driver.manage().window().setSize(new Dimension(500,700));
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.print("\n Title of page i: "+driver.getTitle());
		System.out.print("\n Current url is : "+driver.getCurrentUrl());
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.navigate().to("https://facebook.com");

	}
}
