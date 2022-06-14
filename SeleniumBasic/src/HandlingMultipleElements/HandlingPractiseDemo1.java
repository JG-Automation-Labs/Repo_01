package HandlingMultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPractiseDemo1 {
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement categories = driver.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		System.out.print("\n "+categories.isDisplayed());
		System.out.print("\n "+categories.isEnabled());
		System.out.print("\n "+categories.getText().equals("CATEGORIES"));
		
		WebElement phones = driver.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		System.out.print("\n "+phones.isDisplayed());
		System.out.print("\n "+phones.isEnabled());
		System.out.print("\n " +phones.getText().equals("Phones"));
		
		WebElement Laptops =driver.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
		System.out.print("\n "+Laptops.isDisplayed());
		System.out.print("\n "+Laptops.isEnabled());
		System.out.print("\n "+Laptops.getText().equals("Laptops"));
		}
}