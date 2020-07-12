package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviders {

	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		
		Object[][] stuff = null;
		
		if(m.getName().equals("testLogin")){
		
		stuff = new Object[2][2];
		
		stuff[0][0] = "raman";
		stuff[0][1] = "sdfdsfdilf";
		
		stuff[1][0] = "Rahul";
		stuff[1][1] = "asdfhsdlkfjls";
		
		}else if(m.getName().equals("testUserReg")){
			
			stuff = new Object[2][3];
			
			stuff[0][0] = "raman";
			stuff[0][1] = "ahuja";
			stuff[0][2] = "sdfds@gmail.com";
			
			stuff[1][0] = "Rahul";
			stuff[1][1] = "Arora";
			stuff[1][2] = "sdfdsfdilf@gmail.com";
			
		}
		return stuff;
		
		
	}
	
	
	
	/*@DataProvider(name="dp2")
	public static Object[][] getData2(){
		
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "raman";
		data[0][1] = "ahuja";
		data[0][2] = "sdfds@gmail.com";
		
		data[1][0] = "Rahul";
		data[1][1] = "Arora";
		data[1][2] = "sdfdsfdilf@gmail.com";
		return data;
		
		
	}
*/
}
