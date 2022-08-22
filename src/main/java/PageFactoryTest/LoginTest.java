package PageFactoryTest;

import PageFactory.LoginPage;
import PageFactory.MyAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    @Test
    public void login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailField().sendKeys("ashiqur.rahman@enosisbd.com");
        loginPage.passwordField().sendKeys("test1234");
        loginPage.loginButton().click();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.accountBreadcrumb().isDisplayed());

        driver.close();
    }
}
