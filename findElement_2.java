package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElement_2 {
	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
	WebDriver driver = new FirefoxDriver();
	//Launch an Online Store Website
	driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
	Thread.sleep(5000);
	//Click on "Partial Link Text" link
	driver.findElement(By.partialLinkText("Partial")).click();
	System.out.println("Partial Link Test Pass");
	Thread.sleep(3000);
	//Convert element into a String
	String submit = driver.findElements(By.tagName("button")).toString();
	System.out.println(submit);
	Thread.sleep(3000);
	//Click on "Link Text" link
	driver.findElement(By.linkText("Link Test")).click();
	System.out.println("Link Test Pass");
	Thread.sleep(3000);
	driver.quit();
	
}
}