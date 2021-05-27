package selenium_tutoial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver ();
	
	driver.get("https://www.google.com");
	Thread.sleep(4000);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.navigate().to("https://www.facebook.com");
	driver.navigate().back();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("akshay gaikwad mukundwadi ");
	driver.findElement(By.name("pass")).sendKeys("santoshimatanagar");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	
	

	}

}
