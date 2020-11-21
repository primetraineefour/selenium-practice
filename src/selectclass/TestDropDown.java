package selectclass;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by Jay
 */
public class TestDropDown extends BaseTest {

    private String baseUrl = "https://learn.letskodeit.com/p/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

    public void selectByValue(By by, String value){
        Select select = new Select( driver.findElement(by));
        select.selectByVisibleText(value);
    }

    @Test
    public void dropDownExample() throws InterruptedException {

        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select select = new Select(dropDown);

        Thread.sleep(2000);
        System.out.println("Select Benz by Text");
        select.selectByVisibleText("Benz");



        Thread.sleep(2000);
        System.out.println("Select Honda by index");
        select.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select BMW by value");
        select.selectByValue("bmw");

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }

    }
}
