package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCommands {
	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
	WebDriver driver = new FirefoxDriver();
	//Put an Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Open ToolsQA WebSite
	String appUrl = ("http://toolsqa.wpengine.com/automation-practice-form");
	driver.get(appUrl);
	//Story: Select 'Selenium Commands' Multiple select box (Use Name locator to identify the element)
	Select oSelection = new Select (driver.findElement(By.name("selenium_commands")));
	//Story: Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
	oSelection.selectByIndex(0);
	Thread.sleep(2000);
	oSelection.deselectByIndex(0);
	//Story: Select option 'Navigation Commands' and then deselect it (Use selectByVisibleText and deselectByVisibleText
	oSelection.selectByVisibleText("Navigation Commands");
	Thread.sleep(2000);
	oSelection.deselectByVisibleText("Navigation Commands");
	//Story: Print and select all the options for the selected Multiple selection list
	List <WebElement> oSize = oSelection.getOptions();
	int iListSize = oSize.size();
	//Setting up the loop to print all the options
	for (int i=0; i < iListSize; i++){
		//Storing the value of the option
		String sValue = oSelection.getOptions().get(i).getText();
		//Printing the stored value
		System.out.println(sValue);
		//Selecting all the elements one by one
		oSelection.selectByIndex(i);
		Thread.sleep(3000);
	}
	//Story: Deselect all
	oSelection.deselectAll();
	Thread.sleep(2000);
	//Kill the browser
	driver.quit();	
	}
}
