package day13;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestAnnotation2 {
	
	
	@BeforeClass
	void Login() {
		System.out.println("I am login from before class");
	}
	
	@Test(priority=1)
	void Search() {
		System.out.println("I am Search from Test");
	}
	
	@Test(priority=1)
	void AdvanceSearch() {
		System.out.println("I am Advance Search from Test");
	}
	
	
	@AfterClass
	void Logout() {
		System.out.println("I am logout from after class");
	}
	
}
