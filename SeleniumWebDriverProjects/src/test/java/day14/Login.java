package day14;

import org.testng.annotations.Test;

public class Login {
	
	@Test(groups="sanity")
	void loginGoogle() {
		System.out.println("Login through google");
	}
	
	@Test(groups="sanity")
	void loginFaceBook() {
		System.out.println("Login through facebook");
	}
	
	@Test(groups="sanity")
	void loginTwitter() {
		System.out.println("Login through twitter");
	}
}
