package alert;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class TestAlert extends BaseTest {

    private String baseUrl = "https://mail.rediff.com/cgi-bin/login.cgi";

    @Before
    public void openBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void alertExample() {
        clickOnElement(By.name("proceed"));
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        closeBrowser();
    }
}
