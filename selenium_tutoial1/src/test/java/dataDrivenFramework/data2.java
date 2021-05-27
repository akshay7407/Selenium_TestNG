package dataDrivenFramework;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class data2 {
	
	
	@Test (dataProvider="testdata")
	
	public void login (String a,String b) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys(a);
		driver.findElement(By.name("txtPassword")).sendKeys(b);
	    driver.close();
		
	}
	
	
	@DataProvider(name="testdata")
	
	public Object [][] getdata() throws Exception  {
		
		excel1 obj=new excel1("C:\\Users\\lenovo\\Desktop\\java files\\selenium_tutoial1\\excel\\tbs.xlsx");
		
		int a=obj.getRow(0);
		
		Object data [][]=new Object[a][2];
		
		for(int i=1;i<a;i++)
		{
			data[i][0]=obj.getdata(0, i, 0);
			
			data[i][1]=obj.getdata(0, i, 1);
			
			
		}
		return data;
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
