package day13;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation3 {
	 @BeforeTest
	    public void beforeTest() {
	        System.out.println("Before Test - Runs once before any test in the <test> tag");
	    }

	    @Test
	    public void test1() {
	        System.out.println("Executing Test 1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Executing Test 2");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test - Runs once after all test methods in the <test> tag");
	    }
}
