package Handling;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrame {

	public static void main(String[] args) {
		String path ="F:\\JavaWorkspace\\SeleniumBasic\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement frame= driver.findElement(By.cssSelector(".demo-frame"));
		//System.out.print(frame);
		driver.switchTo().frame(frame);
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		System.out.println(src.getText());
		WebElement dest = driver.findElement(By.id("droppable"));
		System.out.print(dest.getText());
		act.dragAndDrop(src,dest).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo>a")).click();
	}

}
