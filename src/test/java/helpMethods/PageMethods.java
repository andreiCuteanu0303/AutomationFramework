package helpMethods;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class PageMethods {

    public WebDriver driver;

    public PageMethods(WebDriver driver){
        this.driver=driver;
    }

    public void NavigateToURL(String URL){
        driver.navigate().to(URL);
    }

    public void validateTitlePage (String Expected){
        String Actual = driver.getTitle();
        Assert.assertEquals(Expected, Actual);
    }
}
