package day13;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotation4 {
	@BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Runs before all tests in the suite");
    }

    @Test
    public void test1() {
        System.out.println("Executing Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Executing Test 2");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Runs after all tests in the suite");
    }
}
