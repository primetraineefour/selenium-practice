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
public class TestDragAndDrop extends BaseTest {

    private String baseUrl = "https://jqueryui.com/resources/demos/droppable/default.html";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

    @Test
    public void dragAndDropExample(){

        WebElement draggable = driver.findElement(By.id("draggable"));

        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(draggable, droppable).perform();

    }
}
