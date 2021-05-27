package testng1;

import org.testng.annotations.Test;

public class demo3 extends demo2 {
	@Test(groups= {"youtube"})
	void a1()
	{
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getCurrentUrl());
	}
	@Test(groups= {"gmail"})
	void a2 ()
	{
		driver.get("https://www.gmail.com");
		String h=driver.getTitle();
		System.out.println(h);
	}
}
