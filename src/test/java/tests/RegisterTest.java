package tests;

import Objects.AlertObject;
import Objects.RegisterObject;
import base.BaseTest;
import base.Hooks;
import helpMethods.ElementMethods;
import org.junit.Test;
import org.openqa.selenium.*;
import pages.IndexPage;
import pages.RegisterPage;

import java.util.List;

public class RegisterTest extends Hooks {

    @Test
    public void registerMethod() {
        RegisterObject registerObject = new RegisterObject(TestData);

        IndexPage indexPage = new IndexPage(driver);

        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.RegisterProcess(registerObject);
    }
}
