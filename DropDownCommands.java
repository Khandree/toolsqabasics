package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommands {
	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
	WebDriver driver = new FirefoxDriver();
	//Put an Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Open ToolsQA WebSite
	String appUrl = ("http://toolsqa.wpengine.com/automation-practice-form");
	driver.get(appUrl);
	//Story: Select "Continents" Drop Down (use ID to identify the element)
	//Find Select element of 'Single selection' using ID locator
	Select oSelection = new Select(driver.findElement(By.id("continents")));
	Thread.sleep(2000);
	//Story: Select option 'Europe' (use select by index)
	oSelection.selectByIndex(1);
	Thread.sleep(3000);
	//Story: Select option 'Africa' (use select by visible text)
	oSelection.selectByVisibleText("Africa");
	Thread.sleep(3000);
	//Story: Print all the options for the selected drop down and select one option of your choice
	//Get the size of the Select element
	List <WebElement> oSize = oSelection.getOptions();
	int iListSize = oSize.size();
	//Setting up the loop to print all the options
	for (int i=0; i < iListSize; i++){
		//Storing the value of the option
		String sValue = oSelection.getOptions().get(i).getText();
		//Print the stored value
		System.out.println(sValue);
		//Putting a check on each option that if any of the option is equal to 'Antartica' then select it
		if (sValue.equals("Antartica")){
			oSelection.selectByIndex(i);
			break;
		}
	}
	Thread.sleep(3000);
	//Kill the browser
	driver.quit();
	}
}
