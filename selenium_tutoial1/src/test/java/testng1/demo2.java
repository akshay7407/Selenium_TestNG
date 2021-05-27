package testng1;

import org.testng.annotations.Test;

public class demo2 extends demo1 {
	
	@Test
	public void m1() {
		System.out.println(driver.getTitle());
	}
     @Test
	public void m2()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	
	
	
	
	
	
	
	
	
}
