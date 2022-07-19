import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.omayo.blogspot.com");

        driver.findElement(By.id("alert1")).click();

        Alert alert = driver.switchTo().alert();

        String str = alert.getText();

        System.out.println(str);

        Thread.sleep(5000);

        alert.accept();

        driver.switchTo().defaultContent();

        driver.close();
    }
}
