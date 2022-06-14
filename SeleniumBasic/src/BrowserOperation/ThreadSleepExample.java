package BrowserOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThreadSleepExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	
			WebElement UsernameInputField =driver.findElement(By.id("username"));
			UsernameInputField.sendKeys("admin");
			
			WebElement PasswordInputField = driver.findElement(By.name("pwd"));
			PasswordInputField.sendKeys("manager");
			
			WebElement LoginButtonField = driver.findElement(By.id("loginButtonContainer"));
			LoginButtonField.click();
			Thread.sleep(2000);

			String ActualHomePageTitle= driver.getTitle();
			System.out.print("\nActual home page title is: "+ActualHomePageTitle);
			
			String expectedTitle = "actiTIME - Enter Time-Track";
			if(ActualHomePageTitle.equals(expectedTitle))
				{
				System.out.println("\nLogin is sucessefull and home page tite is verified");
				}
			else
				{
				System.out.print("\nlogin is failed or  home page title changed");
				}
			driver.findElement(By.id("logoutLink")).click();
	}


}
