package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel_parameter {
	
	WebDriver driver;

	@Test
	@Parameters("browser")
	public void m1(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com");

		System.out.println(driver.getTitle());
		
		driver.close();

}}