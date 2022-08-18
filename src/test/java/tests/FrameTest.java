package tests;

import Objects.FrameObject;
import base.Hooks;
import helpMethods.ElementMethods;
import helpMethods.FrameMethods;
import helpMethods.PageMethods;
import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.FramePage;
import pages.IndexPage;
import pages.RegisterPage;

public class FrameTest extends Hooks {

    @Test
    public void FrameMethod(){

        FrameObject frameObject = new FrameObject(TestData);

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.GoToFramePage();

        FramePage framePage = new FramePage(driver);
        framePage.BuildSingleFrame(frameObject);

        framePage.BuildMultipleFrames(frameObject);
    }
}
