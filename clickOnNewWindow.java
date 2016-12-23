package test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
 
public class clickOnNewWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/home/agata/eclipse/java-neon2/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//Launch the DemoQA WebSite
		driver.get("http://demoqa.com/frames-and-windows/");
		Thread.sleep(5000);
		//Open NewWindow tab
		driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
		driver.quit();
	}
}