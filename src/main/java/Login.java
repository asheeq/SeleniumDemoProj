import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        driver.findElement(By.id("input-email")).sendKeys("asheeq.bracu@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("asheeq");
        driver.findElement(By. xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")).click();

        driver.close();
    }
}
