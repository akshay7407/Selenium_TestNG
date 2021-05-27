package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest {
	JavascriptExecutor js;
	WebDriver driver;

	@BeforeMethod

	public  void login () {

		WebDriverManager.chromedriver().setup();

		driver=new ChromeDriver ();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement wb=	driver.findElement(By.name("txtUsername"));

		WebElement wb1=	driver.findElement(By.name("txtPassword"));

		js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='Admin';",wb);

		js.executeScript("arguments[0].value='admin123';", wb1);

		js.executeScript("document.getElementById('btnLogin').click();");

	}

	@Test 

	public void alertpop() throws InterruptedException

	{
		Thread.sleep(5000);

		js.executeScript("alert('User  logged in succesfully on webpage');");

		Alert a=driver.switchTo().alert();

		a.accept();


	}

	@Test (priority=1)

	public void verifytitle() {


		String actualtitle=driver.getTitle();
		String expectedtitle=js.executeScript("return document.title;").toString();

		Assert.assertEquals(actualtitle, expectedtitle);

	}
	@Test (priority=2)

	public void verifyUrl()
	{

		String Acturl=driver.getCurrentUrl();

		String expurl=js.executeScript("return document.URL;").toString();

		Assert.assertEquals(Acturl, expurl);

	}


	@AfterMethod

	public void teardown()
	{
		driver.manage().deleteAllCookies();
		driver.close();

	}



}
