package SecondPackage;

import org.testng.annotations.*;

public class TestNGAnnot {

    @BeforeMethod
    public void openApplication(){

        System.out.println("Inside @BeforeMethod annotated method - openApplication");

    }

    @AfterMethod
    public void closeBrowser(){

        System.out.println("Inside @AfterMethod annotated method - closeBrowser");

    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("Opening Application under test - Inside @BeforeClass");

    }

    @AfterClass
    public void afterClass(){

        System.out.println("Closing Brower - Inside @AfterClass");

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @Test(priority = 2)
    public void testLogin(){

        System.out.println("Inside @Test annotated method - testLogin");

    }

    @Test(priority = 3)
    public void testHomePage(){

        System.out.println("Testing Home Page functionality");

    }

    @Test(priority = 1)
    public void testRegistration(){

        System.out.println("Testing Registration functionality");

    }
}
