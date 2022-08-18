package pages;

import Objects.LoginObject;
import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailElement;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement passwordElement;

    @FindBy(id = "enterbtn")
    private WebElement pageEnter;

    @FindBy(id = "errormsg")
    private WebElement errorMessagElement;

    public void loginInvalid(LoginObject loginObject){
        pageMethods.validateTitlePage(loginObject.getSignInTitle());
        elementMethods.fillElement(emailElement, loginObject.getEmail());
        elementMethods.fillElement(passwordElement, loginObject.getPassword());
        elementMethods.clickElement(pageEnter);
        elementMethods.validateElementMessage(errorMessagElement, loginObject.getMessage());
    }
}
