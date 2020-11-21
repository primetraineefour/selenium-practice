package workingwithlist;

import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by Jay
 */
public class WorkingWithElementList extends BaseTest {

    private String baseUrl = "https://learn.letskodeit.com/p/practice";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }


    @Test
    public void testListOfElements() throws InterruptedException {

        boolean isChecked = false;

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type, 'radio') and contains(@name, 'cars')]"));
        int size = radioButtons.size();
        System.out.println("Size of the list : " + size);

        for (WebElement radio : radioButtons){
            isChecked = radio.isSelected();
            if (!isChecked){
                radio.click();
                Thread.sleep(5000);
            }
        }

    }
}
