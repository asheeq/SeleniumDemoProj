package FirstPackage;
import org.testng.annotations.Test;

public class TestNG2 {

    @Test(priority=2, groups = {"Smoke"})
    public void testLogin(){

        System.out.println("Testing Login functionality");

    }

    @Test (priority=3)
    public void testHomePage(){

        System.out.println("Testing Home Page functionality");

    }

    @Test(priority=1)
    public void testRegistration(){

        System.out.println("Testing Registration functionality");

    }
}
