package selenium_tutoial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         
         driver.get("https://www.facebook.com");
        String a= driver.getTitle()	;
        System.out.println("title of the page "+a);
         
        String B = driver.getCurrentUrl()	;
     System.out.println("title of current url :"+B);
        WebElement wb = driver.findElement(By.name("email"));
       wb.sendKeys("akshayGaikwad")	;
       driver.findElement(By.name("pass")).sendKeys("45886545644");
       driver.findElement(By.name("login")).click();      
         
         
         
	}

}
