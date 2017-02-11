package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrizationTest {

	@Test(priority=1,dataProviderClass=ParametrizationTest.class,dataProvider="getData")
	public void testParameters(String name, String surname){
		
		System.out.println("Firstname = " + name + " and Lastname = " + surname);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Amit";
		data[0][1] = "Kshirsagar";
		data[1][0] = "Soniya";
		data[1][1] = "Bajaj";
		
		return data;
	}
}
