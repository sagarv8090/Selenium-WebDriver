package day13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    public void checkValue() {
        String expected = "sagar";
        String actual = "sagar";
        Assert.assertEquals(expected, actual, "Values do not match!");
    }
}
