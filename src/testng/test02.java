package testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test02 {

	@BeforeSuite
	public void suiteStart(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void suiteEnd(){
		System.out.println("After Suite");
	}
	
	@Test
	public void test003(){
		System.out.println("Executing test003");
	}

	@Test
	public void test004(){
		System.out.println("Executing test004");
	}
}
