package groups;
import org.testng.annotations.Test;


public class TestGroup1 {
	
	@Test(priority=1,groups = { "high" })
	public void doLogin(){
		
		System.out.println("Login to the System");
		
	}
	
	@Test(priority=2,groups = { "low" })
	public void fillForm(){
		
		System.out.println("Filling up the form");
		
		
	}
	
	@Test(priority=3,groups = { "high" })
	public void searchFlights(){
		
		System.out.println("Searching for flights");
	}
	
	@Test(priority=4,groups = { "med" })
	public void bookTickets(){
		
		System.out.println("Booking a ticket");
		
	}
	

}
