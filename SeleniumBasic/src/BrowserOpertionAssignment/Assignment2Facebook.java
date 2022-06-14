package BrowserOpertionAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.print("\n Title of page is: "+driver.getTitle());
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Facebook – log in or sign up";
		if(ActualTitle.equals(ExpectedTitle))
			System.out.print("\nTitle is correct");

		else
			System.out.print("\nTitle is wrong");
		driver.close();
	}

}
