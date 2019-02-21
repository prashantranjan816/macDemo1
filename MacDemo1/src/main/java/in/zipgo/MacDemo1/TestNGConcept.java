package in.zipgo.MacDemo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGConcept extends BasePage {
	
	
	@Test()
	public void testmethod() {
		System.out.println("Test method executed...");
		
//		BasePage.beforemethodBase();
//		BasePage.afterMethodBase();
	}

	@AfterMethod()
	public void afterMethod() {
		System.out.println("After Method executed...");
	}
	
	

	@BeforeMethod()
	public void beforemethod() {
		System.out.println("Before method executed...");
	}
	
}
