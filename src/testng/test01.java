package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test01 {
	
	@BeforeMethod
	public void setup(){
		System.out.println("THis is before setup");
	}
	
	@AfterMethod
	public void destroy(){
		System.out.println("THis is after method");
	}

	
	@Test
	public void test001(){
		System.out.println("Executing test001");
	}

	@Test
	public void test002(){
		System.out.println("Executing test002");
	}

}
