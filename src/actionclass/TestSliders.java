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
public class TestSliders extends BaseTest {

    private String baseUrl = "https://jqueryui.com/resources/demos/slider/default.html";

    @Before
    public void openBrowser(){
        openBrowser(baseUrl);
    }

    @Test
    public void sliderExample(){

        WebElement mainSlider = driver.findElement(By.xpath("//div[@id='slider']"));

        int width = mainSlider.getSize().width;
        int halfWidth = width/2;

        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, halfWidth, 0).perform();

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


}
