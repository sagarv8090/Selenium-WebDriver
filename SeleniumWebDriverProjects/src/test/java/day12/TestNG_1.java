package day12;

import org.testng.annotations.Test;

public class TestNG_1 {
	
//open app
//login app
//logout app

	@Test(priority=1)
	public void openApp() {
		System.out.println("Opening App....");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Login into App....");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("Logout from App....");
	}
}
