package BrowserOpertionAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerDemo2 {

	public static void main(String[] args) {
		String path ="F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement usernameField = driver.findElement(By.id("username"));
		usernameField.clear();
		usernameField.sendKeys("admin");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.clear();
		passwordField.sendKeys("Test@123");
		
		WebElement Login = driver.findElement(By.className("buttonBlue"));
		Login.click();
		driver.findElement(By.className("userName")).click();
		
		WebElement signOut = driver.findElement(By.partialLinkText("Out"));
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(signOut));

		
		String ActualTitle= driver.getTitle();
		System.out.print("\n actual title is: "+ActualTitle);
		
		String ExpectedTitle = "Dashboard";
		if(ActualTitle.equals(ExpectedTitle))
			System.out.print("\n login is correct");
		else
			System.out.print("\n login is incorrect or path changed");
		
		
	//	signOut.click();
		driver.findElement(By.partialLinkText("Out")).click();
	}

}
