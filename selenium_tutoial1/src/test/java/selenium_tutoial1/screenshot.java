package selenium_tutoial1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		File f=ts.getScreenshotAs(OutputType.FILE);
		
//		File dest=new File("C:\\Users\\lenovo\\Desktop\\notes\\screenshot\\youtube.png");
		
		FileUtils.copyFile( f,new File ("C:\\\\Users\\\\lenovo\\\\Desktop\\\\notes\\\\screenshot\\\\youtube.png"));
		
		
		

	}

}
