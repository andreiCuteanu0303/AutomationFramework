package tests;

import Objects.AlertObject;
import base.Hooks;
import helpMethods.AlertMethods;
import helpMethods.ElementMethods;
import helpMethods.PageMethods;
import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;

import java.sql.Driver;
import java.util.List;

public class AlertTest extends Hooks {

    @Test
    public void alertMethod() {

        AlertObject alertObject = new AlertObject(TestData);

        IndexPage indexPage = new IndexPage(driver);

        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.GoToAlertPage();

        AlertPage alertPage = new AlertPage(driver);
        alertPage.DealAlertOk();
        alertPage.DealAlertCancel();
        alertPage.DealAlertSendKeys(alertObject);
    }
}
