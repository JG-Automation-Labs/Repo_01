package BrowserOperations2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IsDisplayed_IsSelected_IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");

			WebElement UsernameInputField =driver.findElement(By.id("username"));
			System.out.print("Username inpur field is visible: "+UsernameInputField.isDisplayed());
			System.out.print("Username inpur field is enabled: "+UsernameInputField.isEnabled());
		//	System.out.print("Username inpur field is selected: "+UsernameInputField.isSelected());

			UsernameInputField.sendKeys("admin");
			
			WebElement PasswordInputField = driver.findElement(By.name("pwd"));
			PasswordInputField.sendKeys("manager");
			
			WebElement LoginButtonField = driver.findElement(By.id("loginButtonContainer"));
			LoginButtonField.click();
			
		/*	WebElement logoutButton =driver.findElement(By.id("logoutLink"));
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
*/
			String ActualHomePageTitle= driver.getTitle();
			System.out.print("\nActual home page title is: "+ActualHomePageTitle);
			}

}
