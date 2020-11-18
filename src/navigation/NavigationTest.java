package navigation;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class NavigationTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void navigateToURL() throws InterruptedException {
        //Getting current page URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        driver.findElement(By.linkText("Log in")).click();

        Thread.sleep(5000);
        // Back to page
        driver.navigate().back();

        /*System.out.println("Current URL : " + driver.getCurrentUrl());
        //Getting page title
        System.out.println("Page Title : " + driver.getTitle());

        // Getting page source
        System.out.println("Page source " + driver.getPageSource());*/

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
