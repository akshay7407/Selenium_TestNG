package testNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class annotations1 {
  String url="https://www.google.com";
	WebDriver driver;
	
	@BeforeClass
	public void start()
	{
		System.out.println("main method started");
	}
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	
	public void naviagate() {
	
	System.out.println(driver.getTitle());
	Assert.assertEquals("facebook", driver.getTitle());
		
	}
	@Test
	public void scrrenshot() throws IOException
	
	{
		driver.get("https://www.youtube.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
	File fs=	ts.getScreenshotAs(OutputType.FILE);
	
	//File dist=new File("C:\\Users\\lenovo\\Desktop\\notes\\goole.png");
	
	FileUtils.copyFile(fs, new File("C:\\\\Users\\\\lenovo\\\\Desktop\\\\notes\\\\goole.png"));
		
	}
	
	@Test (dependsOnMethods={"naviagate"},alwaysRun=true)
	public void url()
	{
		
		System.out.println(driver.getCurrentUrl());
	}
	
   
    @AfterMethod
    public void statement() {
    	driver.close();
    	System.out.println("akshay gaikwad");
    }
    @AfterClass
    
    public void end()
    {
     	System.out.println("main method ended ");
    }
}
