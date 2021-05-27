package selenium_tutoial1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment8 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver();

		driver.get("https://s1.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
		WebElement wb=driver.findElement(By.id("txtUsername"));
//		step 1: displayed status of text box--- 
		boolean a=wb.isDisplayed();
		System.out.println(a);
//		step 2: enabled status of text box--- 
		boolean b= wb.isEnabled();
		System.out.println(b);
//		step3: enter value in text box
		wb.sendKeys("akshay.gaikwad");
//		step 4: capture values of text box -------------- getAttributes("value")-- syso
		String c=wb.getAttribute("type");
		System.out.println("value of text :"+c);
		Thread.sleep(4000);
//		step 5: clear the text box values
		wb.clear();

		WebElement ak=	driver.findElement(By.name("Submit"));
//		step 6: check display status of login button
		boolean aa=ak.isDisplayed();
		System.out.println(aa);
//		step 7: check enabled status of login button
		boolean bb=ak.isEnabled();
		System.out.println(bb);
//		step 8: return button type-------------------------------- getAttrubutes("type")
		String n=ak.getAttribute("type");
		System.out.println("return button type : "+n);
//		step 9: return button value	-------------- getAttruibutes("value") / getText 
		String t=ak.getAttribute("value");
		System.out.println("return value button :"+t);
//		step 10: click on button
		ak.click();
//		step 11: capture error message------------------ getText() method

		String o= driver.findElement(By.id("spanMessage")).getText();
		System.out.println(o);

	}

}
