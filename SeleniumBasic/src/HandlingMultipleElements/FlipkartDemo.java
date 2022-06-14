package HandlingMultipleElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartDemo {

	public static void main(String[] args) {
		//String path = "F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver",path);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> offers = driver.findElements(By.cssSelector(".xtXmba"));
		System.out.print("\n option count is : "+offers.size());
		List<String> l1 = new ArrayList<String>();
		l1.add("Top Offers");
		l1.add("Grocery");
		l1.add("Mobiles");
		l1.add("Fashion");
		l1.add("Electronics");
		l1.add("Home");
		l1.add("Appliances");
		l1.add("Travel");
		l1.add("Beauty, Toys & More");
		
		for(int i=0;i<offers.size();i++)
		{
		WebElement demo = offers.get(i);
		System.out.print("\n NAme of element is: "+demo.getText());
		System.out.print("\n "+demo.isEnabled());
		System.out.print("\n "+demo.getText().equals(l1.get(i)));
		}
	}

}
