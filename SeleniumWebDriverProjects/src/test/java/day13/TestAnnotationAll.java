package day13;

import org.testng.annotations.*;

public class TestAnnotationAll {

	    @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("Before Suite - Runs once before all tests in the suite");
	    }

	    @AfterSuite
	    public void afterSuite() {
	        System.out.println("After Suite - Runs once after all tests in the suite");
	    }

	    @BeforeTest
	    public void beforeTest() {
	        System.out.println("Before Test - Runs once before any test in the <test> tag");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("After Test - Runs once after all test methods in the <test> tag");
	    }

	    @BeforeClass
	    public void beforeClass() {
	        System.out.println("Before Class - Runs once before any test methods in this class");
	    }

	    @AfterClass
	    public void afterClass() {
	        System.out.println("After Class - Runs once after all test methods in this class");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("Before Method - Runs before each test method");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("After Method - Runs after each test method");
	    }

	    @Test
	    public void test1() {
	        System.out.println("Executing Test 1");
	    }

	    @Test
	    public void test2() {
	        System.out.println("Executing Test 2");
	    }
	}


