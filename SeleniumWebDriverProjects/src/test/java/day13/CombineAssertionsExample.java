package day13;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CombineAssertionsExample {

    @Test
    public void testHardAndSoftAssert() {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Hard assertion starts");
        Assert.assertEquals(5, 5, "Hard assertion passed");

        System.out.println("Soft assertions start");
        softAssert.assertEquals("Hello", "Hi", "Soft assertion failed - Strings not equal");
        softAssert.assertTrue(3 > 5, "Soft assertion failed - Condition is false");

        System.out.println("Test continues even after soft assertion failures");

        softAssert.assertAll(); // Reports soft assertion failures
    }
}
