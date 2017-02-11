package groups;
import org.testng.annotations.Test;


public class TestGroup2 {
	
	@Test(groups = { "high" })
	public void validateFlightResults(){
		
		System.out.println("Validating flight results");
		
	}

}
