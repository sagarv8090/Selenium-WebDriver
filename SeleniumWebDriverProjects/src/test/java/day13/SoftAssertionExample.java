package day13;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

    @Test
    public void testSoftAssert() {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Test Started");

        softAssert.assertEquals(10, 20, "First assertion failed");
        System.out.println("Execution continues after first failed assertion");

        softAssert.assertTrue(false, "Second assertion failed");
        System.out.println("Execution continues after second failed assertion");

        softAssert.assertAll();  // Collects and reports all assertion failures
    }
}
