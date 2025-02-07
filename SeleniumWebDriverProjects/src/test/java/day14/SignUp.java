package day14;

import org.testng.annotations.Test;

public class SignUp {
	
	@Test(groups="Regression")
	void signupGoogle() {
		System.out.println("signup through google");
	}
	
	@Test(groups="Regression")
	void signupFaceBook() {
		System.out.println("signup through facebook");
	}
	
	@Test(groups="Regression")
	void signupTwitter() {
		System.out.println("signup through twitter");
	}
}