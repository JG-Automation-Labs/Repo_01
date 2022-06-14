package BrowserOpertionAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Actitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://demo.actitime.com/");
		driver.get("https://demo.actitime.com/");

		String url = driver.getCurrentUrl();
		String Eurl= "https://demo.actitime.com/login.do";
		
		if(url.equalsIgnoreCase(Eurl))
		{
			System.out.print("current link is correct");
		}
		else
			System.out.print("link is not correct");
	//	System.out.print("\n"+driver.getPageSource());
	//	System.out.print("\n length of page source is: "+driver.getPageSource().length());
		
		System.out.print("\n current url is: "+driver.getCurrentUrl());
		
		String a= driver.getCurrentUrl();
		System.out.print("\ncurrent url: "+a);
		
		String TitleName=driver.getTitle();
		System.out.print("\nTitle name is: "+TitleName+"  and title Length is: "+TitleName.length());
		
		//driver.close();
	}

}
