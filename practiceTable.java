package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practiceTable {
	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
	WebDriver driver = new FirefoxDriver();
	//Put an Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Open ToolsQA WebSite
	String appUrl = ("http://toolsqa.wpengine.com/automation-practice-table");
	driver.get(appUrl);
	//Here we are storing the value from the cell in to the string variable
	String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(sCellValue);
	//Here we are clicking on the link of first row  and the last column
	driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
	System.out.println("Link has been clicked - otherwise an exception would have been thrown.");
	Thread.sleep(3000);
	driver.quit();
	}
}
