package actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rightclick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement wb= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		
		act.contextClick(wb).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		Alert abc =driver.switchTo().alert();
		
		String t=abc.getText();
		
		System.out.println("text on pop up====="+t);

		String c= "clicked: copy";
				
				if (t.endsWith("copy"))
				{
					System.out.println("test case is passed ");
				}
				else
				{
					System.out.println("test case is failed ");
				}
		abc.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
