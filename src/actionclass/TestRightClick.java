package actionclass;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Jay
 */
public class TestRightClick extends BaseTest {

    private String baseUrl = "http://deluxe-menu.com/popup-mode-sample.html";

    @Before
    public void openBrowser(){
        openBrowser(baseUrl);
    }

    @Test
    public void rightClick(){

        WebElement img = driver.findElement(By.xpath("//p[contains(text(),'Click the image to show the menu')]"));

        Actions actions = new Actions(driver);
        actions.contextClick(img).perform();

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
