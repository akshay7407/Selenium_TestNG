package selenium_tutoial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebDriverWait wait= new WebDriverWait(driver,1);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		
		driver.findElement(By.linkText("Gmail")).click()
		;
		
	}

}
