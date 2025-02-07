package day13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

    @Test
    public void testHardAssert() {
        System.out.println("Test Started");

        int actual = 10;
        int expected = 10;
        Assert.assertEquals(actual, expected, "Values are not equal");

        System.out.println("This will execute only if assertion passes");
    }

    @Test
    public void testHardAssertFail() {
        System.out.println("Test Started");

        int actual = 10;
        int expected = 20;
        Assert.assertEquals(actual, expected, "Values are not equal");

        // This line will not execute if assertion fails
        System.out.println("This will not execute if assertion fails");
    }
}
