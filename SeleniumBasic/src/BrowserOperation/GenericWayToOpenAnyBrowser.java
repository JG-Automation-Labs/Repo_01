package BrowserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenAnyBrowser {

	public static void main(String[] args) {
		String ChromeBrowser = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		String FirefoxBrowser = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\geckodriver.exe";
		
	//	OpenBrowser(ChromeBrowser,"chrome");
		OpenBrowser(FirefoxBrowser,"firefox");
	}
	static void OpenBrowser(String DriverPath,String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", DriverPath);
			WebDriver driver = new FirefoxDriver();

		}else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", DriverPath);
			WebDriver driver = new ChromeDriver();
		}
	}


}
