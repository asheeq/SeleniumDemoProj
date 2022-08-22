package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestTwo {
    @Parameters({"URL"})
    @Test
    public void flipkart(String urlName) {
        System.out.println(urlName);
        System.out.println("Flipkart");

    }
}
