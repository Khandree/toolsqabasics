package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class findElement {
public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
	WebDriver driver = new FirefoxDriver();
	//Launch the ToolsQA WebSite
	driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
	Thread.sleep(2000);
	//Type Name in the FirstName text box
	driver.findElement(By.name("firstname")).sendKeys("Jan");
	Thread.sleep(2000);
	//Type LastName in the LastName text box
	driver.findElement(By.name("lastname")).sendKeys("Kowalski");
	Thread.sleep(2000);
	//Click on the Submit button
	driver.findElement(By.id("submit")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
