package selenium_tutoial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class relativexpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		WebElement wb=driver.findElement(By.xpath("//*[@name='login']/preceding::input[@name='pass']"));
//		wb.sendKeys("akshay gaikwad");
//	    
//		driver.findElement(By.xpath("//input[@type='text']/following::input[1]")).sendKeys("akshay gaikwad ");
		
		driver.get("file:///C:/Users/lenovo/Desktop/html%20files/webtablee.html");
		
		WebElement akg=driver.findElement(By.xpath("//table[@style='width:50%']"));
		List<WebElement> rows=	akg.findElements(By.tagName("tr"));
		
		int a=rows.size();
		System.out.println("total size of rows "+a);
		
		for (WebElement all:rows)
		{
			System.out.println(all.getText());
		}
		
		
		
		
		
	}

}
