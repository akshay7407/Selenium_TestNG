package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class prioritydemo {

	
	@Test(priority=1)
	public void facebook() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("akshay gaikwad");
        driver.findElement(By.name("pass")).sendKeys("selenium");
        driver.close();
	}
	
	@Test(priority=3)
	public void youtube()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Assert.assertTrue(false);
		
	}
	
	@Test(priority=2)
	public void freecrm()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.close();
	}
	
	
	}









