import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {
    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.omayo.blogspot.com");

        driver.manage().window().maximize();

        WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));

        Select select = new Select(multiSelectionBoxField);

        select.selectByVisibleText("Volvo");
        select.selectByVisibleText("Swift");
        select.selectByVisibleText("Audi");

        driver.quit();

    }

}
