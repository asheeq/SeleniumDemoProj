package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@class='breadcrumb']//a[text()='Account']")
    private WebElement accountBreadcrumb;

    public WebElement accountBreadcrumb() {
        return accountBreadcrumb;
    }

    /*    By accountBreadcrumb = By.xpath("//*[@class='breadcrumb']//a[text()='Account']");

    public WebElement accountBreadcrumb(){
        return driver.findElement(accountBreadcrumb);
    } */
}
