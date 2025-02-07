package day14;

import org.testng.annotations.Test;
public class DependencyMethod {

	    @Test
	    public void openAPP() {
	        System.out.println("App opened successfully");
	    }

	    @Test(dependsOnMethods = "openAPP")
	    public void login() {
	        System.out.println("Logged in successfully");
	    }

	    @Test(dependsOnMethods = "login")
	    public void search() {
	        System.out.println("Search functionality verified");
	    }

	    @Test(dependsOnMethods = {"login"})
	    public void logout() {
	        System.out.println("Logged out successfully");
	    }
	

}
