package BrowserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser {

	public static void main(String[] args) {
		String path = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver cdriver = new ChromeDriver();
	}

}
