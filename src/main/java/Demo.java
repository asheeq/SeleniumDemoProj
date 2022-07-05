import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://omayo.blogspot.com/");

        driver.manage().window().maximize();

        //WebElement element = driver.findElement(By.id("confirm"));

        //WebElement element = driver.findElement(By.id("textbox1"));

        //WebElement element = driver.findElement(By.name("q"));

        //WebElement element = driver.findElement(By.xpath("//input[@id='confirm']"));

        //Thread.sleep(5000);

        //element.clear();

        //element.click();

        //element.sendKeys("Hello");

        System.out.println(driver.findElement(By.id("pah")).getText());
    }
}
