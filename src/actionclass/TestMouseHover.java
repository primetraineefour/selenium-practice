package actionclass;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Jay
 */
public class TestMouseHover extends BaseTest {

    private String baseUrl = "https://learn.letskodeit.com/p/practice";
    private JavascriptExecutor jse;

    @Before
    public void setUp(){
        openBrowser(baseUrl);
        jse = (JavascriptExecutor) driver;
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

    @Test
    public void mouseHoverExample() throws InterruptedException {
        jse.executeScript("window.scrollBy(0, 1200)");

        WebElement mainElement = driver.findElement(By.id("mousehover"));

        Actions action = new Actions(driver);

        action.moveToElement(mainElement).perform();

        Thread.sleep(3000);
        WebElement subElement = driver.findElement(By.xpath("//a[contains(text(), 'Top')]"));

        action.moveToElement(subElement).click().perform();
    }
}
