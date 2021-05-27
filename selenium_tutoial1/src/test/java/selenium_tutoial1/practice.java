package selenium_tutoial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("akshay gaikwad ");
		driver.findElement(By.name("pass")).sendKeys("7564544");
		WebElement akki=driver.findElement(By.name("login"));
		String a=akki.getAttribute("value");
		System.out.println("name on buttton ===="+a);
		akki.click();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		WebElement you=driver.findElement(By.xpath("//input[@id='search']"));
		you.sendKeys("akshay gaikwad");
		you.click();
		driver.findElement(By.id("search-icon-legacy")).click();
		
		driver.close();
		
		
		


		
	
		
	
		
		
		
		
		
	}

}
