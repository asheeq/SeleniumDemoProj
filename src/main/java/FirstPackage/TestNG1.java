package FirstPackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }


    @Test
    public void printMessage(){
        System.out.println("Printing");
    }

    @Test
    public void testMethodA() throws Exception {

        int a = 1;
        if (a != 10){
            throw new SkipException("Skipped");
        }
    }

    @Test
    public void sampleMethod(){

        Assert.assertEquals("Hello", "Hello");

    }

    @Test(priority=1)
    public void Method2(){

        Assert.assertTrue(6>5);
        System.out.println("1st");
    }

}