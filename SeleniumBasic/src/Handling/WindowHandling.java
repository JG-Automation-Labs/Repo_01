package Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import HandlingMultipleElements.SeleniumUtility;

public class WindowHandling {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://etrain.info/in");
		String HomepageUrl = driver.getWindowHandle();
		System.out.print("home page id is : "+HomepageUrl);
		driver.findElement(By.xpath("//div[p[text()='Connect With Us']]/div/a[4]")).click();
		
		Set<String> allwinId = driver.getWindowHandles();
		System.out.print("all win id are: "+allwinId);
		
		allwinId.remove(HomepageUrl);
		System.out.println("After remoing homeWinID, all windows ID: " + allwinId);
	}

}
