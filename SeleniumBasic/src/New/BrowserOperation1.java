package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOperation1 {

	public static void main(String[] args) {
		
		String path1 = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		String path2 ="F:\\JavaWorkspace\\SeleniumBasic\\executable\\geckodriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("page title is : "+driver.getTitle());
		System.out.println("page title is : "+driver.getPageSource());
		
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.className("pwdfield")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		// driver.close();
	}

}
