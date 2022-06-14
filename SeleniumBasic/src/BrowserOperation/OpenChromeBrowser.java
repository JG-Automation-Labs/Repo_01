package BrowserOperation;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
	//	String driverpath= "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(200,400));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.name("username")).sendKeys("ädmin");
		
	}

}
