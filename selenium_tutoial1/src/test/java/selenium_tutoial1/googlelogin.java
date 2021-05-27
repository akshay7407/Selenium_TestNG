package selenium_tutoial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class googlelogin {

	public static void main(String[] args) throws InterruptedException 
	{
//  System.setProperty("webdriver.chrome.driver", "‪‪‪‪‪C:\\selenium\\chromedriver\\chromedriver.exe");
              WebDriverManager.chromedriver().setup();
          
          WebDriver driver= new ChromeDriver();
          
          driver.get("https://www.google.com");
          Thread.sleep(4000);
          driver.findElement(By.partialLinkText("mail")).click();
          
//          
//    WebElement a=      driver.findElement(By.name("q"));
//    a.sendKeys("akshay kumar");
//    a.submit();
//    driver.findElement(By.name("btnK")).click();

	}

}
