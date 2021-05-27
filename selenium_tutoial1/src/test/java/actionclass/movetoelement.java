package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class movetoelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
//		WebElement wb= driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][1]"));
//		
//		Actions act =new Actions(driver);
//		
//		act.moveToElement(wb).build().perform();
//		
//		driver.findElement(By.linkText("Create a Wish List")).click();

		WebElement wb=driver.findElement(By.xpath("//a[@id='nav-link-prime']"));
		Actions act= new Actions (driver);
		
		act.moveToElement(wb).build().perform();
		
	   WebElement op= driver.findElement(By.linkText("Prime"));
	   
	   
	   op.getAttribute("value");
	   
	   Thread.sleep(4000);
	   op.click();
		
	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
