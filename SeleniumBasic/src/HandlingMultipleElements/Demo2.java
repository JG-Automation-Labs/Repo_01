package HandlingMultipleElements;
import java.util.List;
//import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		String driverPath = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		// step1: set driver executable path by using System.setProperty(String
		// key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		// step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.demoblaze.com/");
		//WebElement categories = driver.findElement(By.cssSelector(".card-title>a:nth-child(1)"));
		List<WebElement> categories = driver.findElements(By.cssSelector(".card-title>a"));

		System.out.print("\n option count is : " +categories.size());
		List<String> l1 = new ArrayList<String>();
		l1.add("Samsung galaxy s6");
		l1.add("Nokia lumia 1520");
		l1.add("Nexus 6");
		l1.add("Samsung galaxy s7");
		l1.add("Iphone 6 32gb");
		l1.add("Sony xperia z5");
		l1.add("HTC One M9");
		l1.add("Sony vaio i5");
		l1.add("Sony vaio i7");
		
		
		for(int i =0;i<categories.size();i++)
		{
		WebElement cat = categories.get(i);
		System.out.println("\n********* Element of List is:*********\t"+cat.getText());
		System.out.print("\n "+cat.isDisplayed());
		System.out.print("\n "+cat.getText().equals(l1.get(i)));
		}
		
	}

}
