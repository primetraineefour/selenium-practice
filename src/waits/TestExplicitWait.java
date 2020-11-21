package waits;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Jay
 */
public class TestExplicitWait extends BaseTest {

    private String baseUrl = "https://letskodeit.teachable.com/pages/practice";

    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(options);
        driver.manage().window().setPosition(new Point(-2000,0));//display 2
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void implicitWaitExample(){

        By loginLink = By.linkText("Login");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginLink));
        element.click();


        WebElement userName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
        userName.sendKeys("test");

    }

    public void waitUntilElementToBeClickable(By by, int timeout){
    }

    public void waitUntilVisibilityOfElementLocated(By by, int timeout){
    }

    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
       closeBrowser();
    }
}
