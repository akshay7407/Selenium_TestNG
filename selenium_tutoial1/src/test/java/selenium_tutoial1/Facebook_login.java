package selenium_tutoial1;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		
		//get url
		driver.get("https://www.facebook.com/r.php");
		// timer set 4 seconds 
		Thread.sleep(4000);
		
		// open url
		driver.get("https://www.facebook.com/r.php");
		
		// find element on webpage 
		WebElement wb=driver.findElement(By.name("firstname"));
		wb.isDisplayed();
		wb.isEnabled();
		wb.sendKeys("akshay");
		String a=wb.getAttribute("value");
		System.out.println(a);
		Thread.sleep(4000);
		driver.findElement(By.name("lastname")).sendKeys("gaikwad");
		driver.findElement(By.name("reg_email__")).sendKeys("7276697407");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123655478");

		WebElement ak=	driver.findElement(By.id("day"));
		System.out.println("day drop down value " +ak.isDisplayed());
		Select sys=new Select (ak);
		sys.selectByVisibleText("28");
		List<WebElement> list=sys.getOptions();
		int t=list.size();
		
		 // print using enhance for loop
		for (WebElement akg:list)
			System.out.println(akg.getText());
		
		
//		for (int i=0;i<t;i++)
//		System.out.println("days list ====="+list.get(i).getText());

		WebElement op=driver.findElement(By.id("month"));
		Select ty=new Select(op);
		ty.selectByValue("10");
		List <WebElement> ui=ty.getOptions();
		
		//printing using enhance for loop 
		
		for (WebElement mo:ui)
		{
			System.out.println(mo.getText());
			String cont=mo.getText();
			
			// confirming the word is present in the list by using equals method
			if(cont.equals("Mar"))
			{
				System.out.println("yes its present --march");
			}
			
			
			// confirming contains methods by using contains 
			if (cont.contains("Mar"))
				System.out.println("yes january and march both are present in the class");
		}
			// for counting the size of month 
			
		int yu=ui.size();
		System.out.println(yu);

		WebElement akg=driver.findElement(By.id("year"));
		Select year= new Select(akg);
		year.selectByVisibleText("1996");
		List<WebElement> red= year.getOptions();
//		for (WebElement o:red)
//        System.out.println("year value to the extension "+o.getText());
			int w=red.size();
		System.out.println("size of years :-"+w);

		WebElement kl=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/input[1]"));
		boolean q=	kl.isSelected();
		System.out.println("radio button not selected:"+q);
		kl.click();
		boolean e= kl.isSelected();
		System.out.println("radio button is selecteed"+e);

		String title=driver.getTitle();
		System.out.println("title of page :-"+title);









	
	
	
	
	
	
	
	
	
	}

}
