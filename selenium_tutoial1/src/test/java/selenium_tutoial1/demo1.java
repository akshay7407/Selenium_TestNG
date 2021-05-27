package selenium_tutoial1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {

	public static void main(String[] args) {
	
 WebDriverManager.chromedriver().setup();
	
 WebDriver driver =new ChromeDriver();

 driver.get("https://www.facebook.com");

 WebElement wb =	driver.findElement(By.xpath("//input[@name='email']"));
 wb.sendKeys("akshay gaikwad@gamail.com");

 boolean display=  wb.isDisplayed();
 System.out.println("text box is displayed"+display);


 boolean enable= wb.isEnabled();
 System.out.println("text box is enabled======"+enable);

 String name=  wb.getAttribute("value");
 System.out.println("email id============="+name);

 WebElement wb1=driver.findElement(By.id("pass"));
 wb1.sendKeys("7276697407");
 System.out.println("password is displayed=========="+wb1.isDisplayed());
 System.out.println("password is enabled======="+wb1.isEnabled());
 System.out.println("password value=========== "+wb1.getAttribute("value"));

 driver.findElement(By.xpath("//button[@value='1']"));




	
	}

}
