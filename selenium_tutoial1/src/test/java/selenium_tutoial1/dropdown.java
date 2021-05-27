package selenium_tutoial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/r.php");
		
		WebElement wb=driver.findElement(By.xpath("//*[@id='month']"));
		
		
       Select sel=new Select (wb);
       
        List <WebElement > list=sel.getOptions();
        
        int a=list.size();
        
        for (int i=0;i<a;i++)
      	
        {
       
        		System.out.println(list.get(i).getText());
        }


		
	}

}
