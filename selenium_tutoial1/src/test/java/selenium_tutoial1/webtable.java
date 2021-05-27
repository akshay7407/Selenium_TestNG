package selenium_tutoial1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {

	    public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=  new ChromeDriver () ;

		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		WebElement wb=driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));

		List <WebElement>akg=wb.findElements(By.tagName("tr"));

		int row=akg.size();
		System.out.println("row size -----"+row);

		for(WebElement ch: akg)
		{
			String abc=ch.getText();

			if (abc.contains("Taiwan"))

			{
				System.out.println("test case 1 is passed ");
			}
		}


		List <WebElement> cel=	wb.findElements(By.tagName("td"));

		int cell=cel.size();
		System.out.println("cell size---"+cell);

		for (WebElement ui:cel) 
		{
			String all= ui.getText();

			System.out.println("cell value---"+all);

			if((all.contains("509m")||(all.contains("Saudi Arabia"))))

			{
				System.out.println("test case 2 is passed");
			}

		}


	}	


}


