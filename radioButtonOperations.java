//    Launch new Browser
//    Open “http://toolsqa.wpengine.com/automation-practice-form/“
//    Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
//    Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
//    Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
//    Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)

package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButtonOperations {
	public static void main(String[] args) throws InterruptedException {
	// Create a new instance of the FireFox driver
	System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
	WebDriver driver = new FirefoxDriver();
	//Put an Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Open ToolsQA WebSite
	String appUrl = ("http://toolsqa.wpengine.com/automation-practice-form");
	driver.get(appUrl);
	//Story: Select the deselected Radio button (female) for category Sex (Use IsSelected method)
	//Storing all the elements under category 'Sex' in the list of WebElements
	List<WebElement> radioButton_Sex = driver.findElements(By.name("sex"));
	//Create a boolean variable which will hold the value (True/False)
	Thread.sleep(5000);
	//This statement will return True, in case of second Radio button is selected
	boolean buttonValue = radioButton_Sex.get(1).isSelected();
	//This will select Second radio button, if the second radio button is selected by default, will select first if the first is selected; when none of them is selected then the programme will select the second one
	if (((buttonValue = radioButton_Sex.get(0).isSelected()) == false) && (buttonValue = radioButton_Sex.get(1).isSelected() == false)){
		radioButton_Sex.get(1).click();
		}
	//Story: Select the Third Radio button from category 'Years Of Exp' (Use ID attribute to select Radio button)
	WebElement radioButton_Exp = driver.findElement(By.id("exp-2"));
	radioButton_Exp.click();
	//Story: Check the Check Box 'Automation Tester' for category 'Profession' (Use Value attribute to match the selection)
	//Find the Checkbox or radio button element by Name
	List <WebElement> checkBox_Profession = driver.findElements(By.name("profession"));
	//This will tell you the number of Check Boxes that are present
	int iSize = checkBox_Profession.size();
	//Start the loop from first Check Box to Last Check Box
	for (int i=0; i < iSize; i++){
		//Store the Check Box name to the string variable, using 'Value' attribute
		String sValue = checkBox_Profession.get(i).getAttribute("value");
		//Select the Check Box if the value of the Check Box is same as what you are looking for
		if (sValue.equalsIgnoreCase("Automation Tester")){
			checkBox_Profession.get(i).click();
			//This will take the execution out of the loop
			break;
		}
	}
	//Story: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
	WebElement oCheck_Box = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
	oCheck_Box.click();
	Thread.sleep(5000);
	//Kill the browser
	driver.quit();
}
}
