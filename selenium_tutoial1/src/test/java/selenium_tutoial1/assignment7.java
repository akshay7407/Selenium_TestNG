package selenium_tutoial1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment7 {

	public static void main(String[] args) {
		//assignment 7
		
                 WebDriverManager.chromedriver().setup();
                 
                 WebDriver driver= new ChromeDriver();
                 
                 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                 
                 driver.get("https://www.gmail.com");
                 // test case1 - compare title with help of if else condition 
              String a=   driver.getTitle()	;
              String b = "Gmail";
              
              if (a.equals(b)) {
            	  System.out.println("test case is passed");
              }
              else
              {
            	  System.out.println("test is failed");
            	  
              }
              // test case 2 compare current url with the help of if else condition 
             String c= driver.getCurrentUrl();
             String d="https://www.gmail.com";
       if (c.equals(d))
       {
    	  System.out.println("current url is correct");
       }
      
      else
      {
    	  System.out.println("current url is not correct");
      }
	}

}
