package day13;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAnnotation1 {
	
	
	@Test(priority=1)
	void Search() {
		System.out.println("I am Search from test annotation");
	}
	
	@BeforeMethod
	void Login() {
		System.out.println("I am login from beforeMethod annotation");
	}
	
	@AfterMethod
	void Logout() {
		System.out.println("I am Logout from afterMethod annotation");
	}

	@Test(priority=2)
	void AdvanceSearch() {
		System.out.println("I am Advance search from test annotation");
	}

}

