package dataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data1 {
   WebDriver driver;
	
	@Test(dataProvider="testdata")
	public void login(String username , String password) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		//Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		//Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="testdata")
	public Object [][] getData() {
		
		Object [][] data = new Object[7][2];
		
		// enter data in row 0 and col 0
		data[0][0]="akshaygaikwad";
		
		// enter data in row 0 and col 1
		data[0][1]="gaikwadakshay";
		
		// enter data in row 1 and col 0
		data[1][0]="akshaygaikwad07@gmail";
		
		// enter data in row 1 and col 1
		data[1][1]=" akshay009@gmail.com";
		
		data[2][0]="username1";
		data[2][1]="password";
		
		data[3][0]="username1";
		data[3][1]="password";
		
		data[4][0]="username1";
		data[4][1]="password";
		
		data[5][0]="username1";
		data[5][1]="password";
		
		data[6][0]="username1";
		data[6][1]="password";
		
		
		
		return data;
	}
}
