package helpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AlertMethods {
    public WebDriver driver;

    public AlertMethods(WebDriver driver){
        this.driver=driver;
    }

    public void AcceptAlert (){
        Alert AlertOK = driver.switchTo().alert();
        AlertOK.accept();
    }

    public void DismissAlert(){
        Alert AlertDismiss = driver.switchTo().alert();
        AlertDismiss.dismiss();
    }

    public void AcceptFillAlert(String FillValue){
        Alert AlertText = driver.switchTo().alert();
        AlertText.sendKeys(FillValue);
        AlertText.accept();
    }
}
