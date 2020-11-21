package actionclass;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by Jay
 */
public class TestKeyboardEvents extends BaseTest {

    private String baseUrl = "https://letskodeit.teachable.com/p/practice";

    @Before
    public void openBrowser(){
        openBrowser(baseUrl);
    }

    @Test
    public void keyBoardExample() throws InterruptedException {
        Actions actions = new Actions(driver);
        driver.findElement(By.id("openwindow")).sendKeys(Keys.CONTROL+"a");
        Thread.sleep(2000);

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        driver.findElement(By.id("name")).click();

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
