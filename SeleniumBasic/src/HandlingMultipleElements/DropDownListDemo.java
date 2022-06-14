package HandlingMultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownListDemo {
		public static void main(String []args) {
			//String path = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
			//System.setProperty("webdriver.chrome.driver",path);
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demosite.executeautomation.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("ëxecution");
			driver.findElement(By.xpath("//input[@name='Login']")).click();
			
			WebElement dropdownlist= driver.findElement(By.xpath("//select[@name='TitleId']"));

			Select s1 = new Select(dropdownlist);
			System.out.print("is dropdown is multiselected: "+s1.isMultiple());
			System.out.print("\n"+s1.getFirstSelectedOption().getText());
			s1.selectByVisibleText("Mr.");
			System.out.print("\n"+s1.getFirstSelectedOption().getText());

	}

}
