package BrowserOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
	WebDriver chromeD = new ChromeDriver();

	chromeD.get("https://www.google.com/");
	String Sourcecode = chromeD.getPageSource();
	System.out.print("Sourcecode is: " +Sourcecode);
	System.out.print("\n\nlength od sourcecodeis:  "+Sourcecode.length());
	String a= chromeD.getCurrentUrl();
	
	System.out.print("\n current Url is: "+a);
	System.out.print("\n\nTitle of the page is : "+chromeD.getTitle());
	chromeD.close();
	}

}
