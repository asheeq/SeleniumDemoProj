package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="input-email")
    private WebElement emailField;
    @FindBy(id="input-password")
    private WebElement passwordField;
    @FindBy(css="input[value='Login")
    private WebElement loginButton;

    public WebElement emailField() {
        return emailField;
    }

    public WebElement passwordField() {
        return passwordField;
    }

    public WebElement loginButton() {
        return loginButton;
    }

    /*    private By emailField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By loginButton = By.cssSelector("input[value='Login");

    public WebElement emailField(){
        return driver.findElement(emailField);
    }

    public WebElement passwordField(){
        return driver.findElement(passwordField);
    }

    public WebElement loginButton(){
        return driver.findElement(loginButton);
    } */
}
