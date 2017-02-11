package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

	static int count = 0;
	
	@Test
	public void doLogin()
	{
		System.out.println("Test passed");
	}

	@Test(dependsOnMethods="doLogin")
	public void SomeThing()
	{
		count++;
		System.out.println("Count is "+ count);
		Assert.assertEquals(count, 3);
	}
	
}
