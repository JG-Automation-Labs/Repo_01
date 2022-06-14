package BrowserOperation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		String path = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", path);
		FirefoxDriver fdriver= new FirefoxDriver();
	}

}
