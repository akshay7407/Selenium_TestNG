package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parallel {
	
	@Test
	
	public void CromeOPs() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://www.google.com");
		driver.close();
		
	}
	
	@Test
	public void Edgeops() {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver() ;
		driver.get("https://www.facebook.com");
		driver.close();
		
	}

}
