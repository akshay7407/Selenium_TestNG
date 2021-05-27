package actionclass;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multipletab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.open('https://www.flipkart.com/')");
		js.executeScript("window.open('https://www.amazon.in/')");
		
		Set<String> win=driver.getWindowHandles();
		
     	ArrayList<String> arr=new ArrayList<String>(win);
		
		driver.switchTo().window(arr.get(2));
		
		String t=driver.getTitle();
		
		System.out.println(t);
		
		driver.switchTo().window(arr.get(2));
         
		//driver.close();
		
		
	}

}
