package BrowserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFireoxBrowser {

	public static void main(String[] args) {
		String path = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		WebDriver fdriver = new FirefoxDriver();
	}

}
