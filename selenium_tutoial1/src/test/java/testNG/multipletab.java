package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class multipletab {

	
	@Test(priority=2)
	public void facebookTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	driver.close();

	}
	@Test(priority=1)
	public void google() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		Assert.assertEquals(12,13);
		
		driver.close();
}
}
