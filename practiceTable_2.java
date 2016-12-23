package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practiceTable_2 {
	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
	WebDriver driver = new FirefoxDriver();
	//Put an Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Open ToolsQA WebSite
	String appUrl = ("http://toolsqa.wpengine.com/automation-practice-table");
	driver.get(appUrl);
	String sRow = "1";
	String sColumn = "2";
	//Here we are locating the xpath by passing variables in the xpath
	String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sColumn + "]")).getText();
	System.out.println(sCellValue);
	String sRowValue = "Clock Tower Hotel";
	//First loop will find the 'Clock Tower Hotel' in the first column
	for (int i=1; i <= 5; i++){
		String sValue = null;
		sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/th")).getText();
		//Ignore case - do not care if the word is 'dog' or 'DOG'
		if (sValue.equalsIgnoreCase(sRowValue)){
			System.out.println(sValue);
			//If the sValue matches with the description, it will initiate one more innet loop for all the columns of 'i' row
			for (int j = 1; j <= 5; j++){
			String sColumnValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
			System.out.println(sColumnValue);
			}
			break;
		}
	}
	driver.quit();
	}
}
