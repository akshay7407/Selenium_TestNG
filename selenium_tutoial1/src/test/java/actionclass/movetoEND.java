package actionclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class movetoEND {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.com/");
		
		Actions a=new Actions (driver);
		
		a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		try {
			Thread.sleep(5000);		} catch (InterruptedException e) {			
		// TODO Auto-generated catch block			e.printStackTrace();
		}
		
		a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	
//		a.build().perform();
//		
//		driver.close();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
