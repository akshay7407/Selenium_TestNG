package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class copyandpaste {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement wb=driver.findElement(By.name("firstname"));
		
		wb.sendKeys("akshay gaikwad");
		
		WebElement wb1=driver.findElement(By.name("lastname"));
		
		wb1.sendKeys("gaikwad patil");
		
		WebElement wb2=driver.findElement(By.xpath("//*[@name='lastname']/following::input[1]"));
		
		
		
	
	   Actions a =new Actions (driver);
	   
	   // copy paste from one box to anather box
		
    	a.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		a.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		a.keyDown(wb,Keys.CONTROL).sendKeys("v").build().perform();
		
		
	   
		// to send capital letter in ext box
//		a.keyDown(wb2, Keys.SHIFT).sendKeys("softteck classes").build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
