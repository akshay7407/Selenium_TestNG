package selenium_tutoial1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_pop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		//enter url
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement wb=driver.findElement(By.name("proceed"));
		//display status
		System.out.println(wb.isDisplayed());
		//get attribute value 
		System.out.println(wb.getAttribute("value"));
		//click on button
		wb.click();
		Alert ak=   driver.switchTo().alert();

		String io=ak.getText();
		System.out.println("gettext :"+io);
		ak.accept();

	}

}
