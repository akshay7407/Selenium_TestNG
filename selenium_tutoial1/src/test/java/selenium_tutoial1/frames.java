package selenium_tutoial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		//lunch as selenium web page
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		// switch to 3rd frame-------------------- by using frame name
		driver.switchTo().frame("classFrame")	;

		//perform operation on element
		driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();

		Thread.sleep(4000);  

		// switch to top frame
		driver.switchTo().defaultContent();
		

		//)switch to 2 frame---------------- by using frame index.
		driver.switchTo().frame(1);
		

		// perform action on frame 2
		driver.findElement(By.linkText("AbstractHttpResponseCodec")).click();
		
		Thread.sleep(4000);
		
		// switch to 1st frame------------------ by using frame webelement
		
   	     driver.switchTo().defaultContent();
   		WebElement wb= driver.findElement(By.name("packageListFrame"));
         driver.switchTo().frame(wb);
         
		//perform operation on element
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();

		
		driver.close();


	}

}
