package MVNTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {

    WebDriver driver;
    ExtentReports extentReports;

    @BeforeMethod
    public void config(){
        String reportPath = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
        reporter.config().setReportName("Test Report");
        reporter.config().setDocumentTitle("Test Document");

        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Operating System","Windows 10");

    }

    @Test
    public void oneTest() {

        ExtentTest eTest = extentReports.createTest("Test Started");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        eTest.info("Chrome Browser Launched");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://omayo.blogspot.com/");
        eTest.info("Application Loaded");
        String actualText = driver.findElement(By.id("pah")).getText();
        eTest.fail("Test Failed");
        Assert.assertEquals(actualText,"PracticeAutomationHereOO");
    }

    @AfterMethod
    public void closeBrowser(){

        driver.close();
        extentReports.flush();
    }

}
