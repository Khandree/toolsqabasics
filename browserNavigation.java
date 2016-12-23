//    Launch new Browser
//   Open DemoQA.com website //   Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
//    Come back to Home page (Use ‘Back’ command)
//    Again go back to Registration page (This time use ‘Forward’ command)
//    Again come back to Home page (This time use ‘To’ command)
//    Refresh the Browser (Use ‘Refresh’ command)
//    Close the Browser


package test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
public class browserNavigation {
	public static void main(String[] args) throws InterruptedException {
		// Create a new instance of the FireFox driver
		System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
		WebDriver driver = new FirefoxDriver();
		// Open ToolsQA web site
		String appUrl = "http://www.DemoQA.com";
		driver.get(appUrl);		
		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();	
		Thread.sleep(6000);
		// Go back to Home Page
		driver.navigate().back();
		Thread.sleep(6000);
		// Go forward to Registration page
		driver.navigate().forward();
		Thread.sleep(6000);
		// Go back to Home page
		driver.navigate().to(appUrl);
		Thread.sleep(6000);
		// Refresh browser
		driver.navigate().refresh();
		Thread.sleep(6000);		
		System.out.println("odswiez");
		// Close browser
		driver.quit();
	}
}