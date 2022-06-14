package TestNgDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import HandlingMultipleElements.SeleniumUtility;

public class ActiTimeLoginDemo {
	@Test
	public void ActiLogin() {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.facebook.com");
		Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up","Title chnages or mismatched");
		driver.findElement(By.cssSelector("._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();
		
	}
}
