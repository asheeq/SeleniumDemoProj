import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Demo {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = null;
        String browser = "Chrome";

        if(browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

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

        //System.out.println(driver.findElement(By.id("pah")).getText());

        //Find the whole API documentation -
        //https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html

        //String title = driver.getTitle();
        //String url1 = driver.getCurrentUrl();

        //System.out.println(title);
        //System.out.println(url1);

        //String value = driver.findElement(By.id("textbox1")).getAttribute("value");
        //driver.findElement(By.linkText("compendiumdev")).click();
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(value);

        //Boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
        //Boolean enabled = driver.findElement(By.id("but2")).isEnabled();

        //System.out.println("Displayed:" +displayed);
        //System.out.println("Enabled:" +enabled);

        //String source = driver.getPageSource();
        //System.out.println(source);

        //driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");

        List<WebElement> elements = driver.findElements(By.tagName("a"));

        /*for(int i=0; i<elements.size();i++){
            if(elements.get(i).getText().length()>0){
                System.out.println(elements.get(i).getText());
            }
        }*/

        for(WebElement j : elements){
            if(j.getText().length()>0){
                System.out.println(j.getText());
            }
        }

        //close a single window
        //driver.close();
        //close whole browser
        driver.quit();
    }
}
