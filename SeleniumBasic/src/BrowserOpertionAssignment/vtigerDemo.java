package BrowserOpertionAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerDemo {
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	
	String ActualTitle= driver.getTitle();
	String ExpectedTitle = "vtiger";
	//System.out.print("Actual Title of page is: "+ActualTitle);
	
	if(ActualTitle.equals(ExpectedTitle))
		System.out.print("\n login page is opened");
	else
		System.out.print("entered url is incorrect or site changed");
	
	WebElement username=driver.findElement(By.id("username"));
	username.clear();
	
	WebElement Password = driver.findElement(By.id("password"));
	Password.clear();
	
	username.sendKeys("admin");
	Password.sendKeys("Test@123");
	
	WebElement loginButton = driver.findElement(By.className("buttonBlue"));
	loginButton.click();
	}
}
