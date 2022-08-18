package pages;

import Objects.AlertObject;
import helpMethods.AlertMethods;
import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".nav-stacked>li>a")
    private List<WebElement> AlertOptions;

    @FindBy(css = ".btn.btn-danger")
    private WebElement AlertOKPop;

    @FindBy(css = ".btn.btn-primary")
    private WebElement AlertCancel;

    @FindBy(css = ".btn.btn-info")
    private WebElement AlertTextbox;

    public void DealAlertOk(){
        elementMethods.clickElement(AlertOptions.get(0));
        elementMethods.clickElement(AlertOKPop);
        alertMethods.AcceptAlert();
    }

    public void DealAlertCancel(){
        elementMethods.clickElement(AlertOptions.get(1));
        elementMethods.clickElement(AlertCancel);
        alertMethods.DismissAlert();
    }

    public void DealAlertSendKeys(AlertObject alertObject){
        elementMethods.clickElement(AlertOptions.get(2));
        elementMethods.clickElement(AlertTextbox);
        alertMethods.AcceptFillAlert(alertObject.getAlertValue());
    }
}
