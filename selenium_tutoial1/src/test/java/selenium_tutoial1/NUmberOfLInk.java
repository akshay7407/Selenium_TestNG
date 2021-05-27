package selenium_tutoial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NUmberOfLInk {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\java files\\hybrid_framework\\chromedriver.exe");
		WebDriver 	driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement>  list=driver.findElements(By.tagName("a"));
		int a=list.size();
		System.out.println(a);
		for (WebElement alltext:list)
		{
			System.out.println(alltext.getText());
		}
		

	}

}
