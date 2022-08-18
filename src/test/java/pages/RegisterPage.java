package pages;

import Objects.RegisterObject;
import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement SwitchToDropdown;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement AlertsDropdown;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement FramesDropdown;

    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement WindowsDropdown;

    @FindBy (xpath = "//input[@ng-model='FirstName']")
    private WebElement FirstName;

    @FindBy (css = "input[ng-model='LastName']")
    private WebElement LastName;

    @FindBy (css = "textarea[ng-model='Adress']")
    private WebElement Address;

    @FindBy (css = "input[ng-model='EmailAdress']")
    private WebElement Email;

    @FindBy (css = "input[ng-model='Phone']")
    private WebElement PhoneNr;

    @FindBy (css = "input[value='Male']")
    private WebElement Gender;

    @FindBy (css = "input[id='checkbox2']")
    private WebElement Hobbies;

    @FindBy (id = "yearbox")
    private WebElement YearDropdown;

    @FindBy (xpath = "//select[@placeholder='Month']")
    private WebElement MonthDropdown;

    @FindBy (id = "daybox")
    private WebElement DayDropdown;

    @FindBy (id = "msdd")
    private WebElement LanguagesDropdown;

    @FindBy (css = ".ui-front>li>a")
    private List<WebElement> LanguagesOptions;

    @FindBy (css = ".select2-selection")
    private WebElement SelectCountry;

    @FindBy (className = "select2-search__field")
    private WebElement SelectCountryInput;

    @FindBy (css = "select[id='Skills']")
    private WebElement SkillsDropdown;

    @FindBy (id = "firstpassword")
    private WebElement Password;

    @FindBy (id = "secondpassword")
    private WebElement ConfirmPassword;

    @FindBy (id = "submitbtn")
    private WebElement Submit;

    public void GoToAlertPage(){
        elementMethods.hoverElement(SwitchToDropdown);
        elementMethods.clickElement(AlertsDropdown);
        pageMethods.NavigateToURL("https://demo.automationtesting.in/Alerts.html");
    }

    public void GoToFramePage(){
        elementMethods.hoverElement(SwitchToDropdown);
        elementMethods.clickElement(FramesDropdown);
        pageMethods.NavigateToURL("https://demo.automationtesting.in/Frames.html");
    }

    public void GoToWindowsPage(){
        elementMethods.hoverElement(SwitchToDropdown);
        elementMethods.clickElement(WindowsDropdown);
        pageMethods.NavigateToURL("https://demo.automationtesting.in/Windows.html");
    }

    public void RegisterProcess(RegisterObject registerObject){
        elementMethods.fillElement(FirstName, registerObject.getFirstNameValue());
        elementMethods.fillElement(LastName, registerObject.getLastNameValue());
        elementMethods.fillElement(Address, registerObject.getAddressValue());
        elementMethods.fillElement(Email, registerObject.getEmailValue());
        elementMethods.fillElement(PhoneNr, registerObject.getPhoneNrValue());
        elementMethods.clickElement(Gender);
        elementMethods.clickElement(Hobbies);
        elementMethods.selectElementByValue(YearDropdown, registerObject.getYearValue());
        elementMethods.selectElementByText(MonthDropdown, registerObject.getMonthValue());
        elementMethods.selectElementByText(DayDropdown, registerObject.getDayValue());
        LanguagesProcess(registerObject.getLanguagesValues());
        CountryProcess(registerObject.getCountryValue());
        elementMethods.selectElementByValue(SkillsDropdown, "Java");
        elementMethods.fillElement(Password, registerObject.getPasswordValue());
        elementMethods.fillElement(ConfirmPassword, registerObject.getConfirmPasswordValue());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Submit);
        elementMethods.clickElement(Submit);
    }

    public void LanguagesProcess(String languages){
        elementMethods.clickElement(LanguagesDropdown);
        for(int index=0; index<LanguagesOptions.size(); index++){
            if (LanguagesOptions.get(index).getText().equals(languages)) {
                LanguagesOptions.get(index).click();
            }
        }
        elementMethods.clickElement(FirstName);
    }

    public void CountryProcess(String country){
        elementMethods.clickElement(SelectCountry);
        elementMethods.fillElement(SelectCountryInput, country);
        SelectCountryInput.sendKeys(Keys.ENTER);
    }
}
