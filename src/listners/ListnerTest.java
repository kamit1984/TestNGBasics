package listners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListnerTest {

	@Test(groups={"listner"},testName="Booking")
	public void doLogin(){
		System.out.println("Test works");
	}

	@Test(groups={"listner"},testName="Booking")
	public void FillForm(){
		System.out.println("AssertFails");
		Assert.fail();
	}
	
	@Test(groups={"listner"},testName="Booking")
	public void validateData(){
		System.out.println("Validation");
		throw new SkipException("Skipping the test");
	}
	
}
