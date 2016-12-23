package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testowa {

	public static void main(String[] args) {
		
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
        WebDriver driver = new FirefoxDriver();
        
        //Store the app url in the String variable 
        String url = "http://store.demoqa.com/";
        		
        //Launch the Online Store Website
        driver.get(url);

        //Store the title name in the String variable 
        String title = driver.getTitle(); 
	
        //Store title length in the Int variable
        int titleLength = driver.getTitle().length();
        
        //Print Title & Title Length in the Console window
        System.out.println("Title of this page is: " + title);
        System.out.println("Length of the title of this page is: " + titleLength);
        
        //Store URL in String variable
        String actualUrl = driver.getCurrentUrl();
        
        if(actualUrl.equals(url)){
        	System.out.println("Verification successful - The correct Url is opened.");
        }else{
        	System.out.println("Verification failed - An incorrect Url is opened.");
        	//If failed, I want to print the actual Url and the Expected Url
        	System.out.println("Actual Url is: " + actualUrl);
        	System.out.println("Expected Url is: " + url);
        }
        
        //Store Page Source in the String variable
        String pageSource = driver.getPageSource(); 
        
        //Store Page Source Length in the Int variable
        int pageSourceLength = pageSource.length();
        
        //Print length of the Page Source in console
        System.out.println("Total length of the Page Source is: " + pageSourceLength);
        
        driver.close();
        
        driver.quit();
	}	
}
