package selenium_tutoial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintestcase  {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=  new ChromeDriver () ;
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.spotify.com/in-en/signup/?sp_t_counter=1");
		try {
		WebElement ak=driver.findElement(By.id("https://www.spotify.com/in-en/signup/?sp_t_counter=1"));
		
		ak.isDisplayed();
		ak.isEnabled();
		ak.sendKeys("akshaygaikwad");
	 String value =ak.getAttribute("value");
	 System.out.println(value);
		}
		catch (Exception e)
		{
			System.out.println("website url error");
			e.printStackTrace();
		
		}
		
		
	   	driver.findElement(By.name("confirm")).sendKeys("akshaygaikwad");
	   	driver.findElement(By.name("password")).sendKeys("7276697407");
	   	WebElement pname=driver.findElement(By.name("displayname"));
	   	pname.sendKeys("mr.cool_akki");
	   	pname.getText();
	   	WebElement year =driver.findElement(By.id("year"));
	   	year.sendKeys("1996");
	   	WebElement month=driver.findElement(By.name("month"));
	   	Select mo= new Select (month);
	   	mo.selectByIndex(9);
	   	List<WebElement> sizee=	mo.getOptions();
	   	int monthsize = sizee.size();
	   	System.out.println(monthsize);
	   	driver.findElement(By.id("day")).sendKeys("28");
	   	driver.findElement(By.className("Indicator-sc-16vj7o8-0 iBjMfh")).click();
	  String gender= 	driver.findElement(By.xpath("1")).getAttribute("value");
	   	System.out.println("gender==="+gender);
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
	   	
		}

}
