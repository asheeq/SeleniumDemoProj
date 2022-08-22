package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestThree {

    @Test(dataProvider="getData")
    public void flipkart(String username,String password) {

        System.out.println("Bob - "+username+" and "+password);

    }

    @DataProvider
    public Object[][] getData() {

        Object[][] data = new Object[3][2];

        data[0][0] = "Ashiq";
        data[0][1] = "12345";

        data[1][0] = "Rahman";
        data[1][1] = "6789";

        data[2][0] = "Adham";
        data[2][1] = "1111";

        return data;

    }
}
