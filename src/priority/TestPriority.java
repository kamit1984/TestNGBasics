package priority;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPriority {
	
	@Test(priority=1)
	public void testLogin(){
		
		
		System.out.println("Executing Test One");
		Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods = { "testLogin" })
	public void testUserReg(){
		
		
		System.out.println("Executing Test Two");
	}
	
	@Test(priority=3,dependsOnMethods = { "testLogin" },alwaysRun=true)
	public void testThree(){
		
		System.out.println("Executing Test Three");

	}
	
	@Test(priority=4,dependsOnMethods = { "testLogin" },alwaysRun=true)
	public void testFour(){
		
		
		System.out.println("Executing Test Four");
	}
	
	
}
