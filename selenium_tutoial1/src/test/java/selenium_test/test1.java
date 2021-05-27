package selenium_test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.name("txtUsername")).sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		WebElement w1=driver.findElement(By.id("menu_admin_viewAdminModule"));

		Actions act=new Actions (driver);

		act.moveToElement(w1).build().perform();

		WebElement wb2=driver.findElement(By.xpath("//*[text()='User Management']"));

		act.moveToElement(wb2).build().perform();

		driver.findElement(By.xpath("//*[text()='Users']")).click();

//		driver.findElement(By.name("btnAdd")).click();
//
//		WebElement sel=	driver.findElement(By.name("systemUser[userType]"));
//
//		Select drop= new Select(sel);
//
//		drop.selectByVisibleText("ESS");
//
//		List<WebElement> Count =drop.getOptions();
//
//		int e=Count.size();
//		System.out.println("drop down size-----"+e);
//
//		driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("David Morris");
//
//		driver.findElement(By.name("systemUser[userName]")).sendKeys("akshaygaikwad4488");
//
//		WebElement sel2=driver.findElement(By.name("systemUser[status]"));
//
//		Select drop1=new Select (sel2);
//
//		drop.selectByIndex(1);
//
//		driver.findElement(By.name("systemUser[password]")).sendKeys("Akshay@321");
//
//
//		driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("Akshay@321");
//
//		driver.findElement(By.id("btnSave")).click();

		WebElement wb4=driver.findElement(By.xpath("//input[@name='chkSelectRow[]'][@value='46']"));

		wb4.isSelected();
		wb4.click();
		wb4.isSelected();

		driver.findElement(By.xpath("//input[@id='btnDelete']")).click();

		Alert pop=driver.switchTo().alert();

		pop.accept();


	}

}
