package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay
 */
public class Utility {

    public WebDriver driver;

    /**
     * This method will click on element
     */
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    public void clickOnElement(WebElement element){
        element.click();
    }


    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    public void sendTextToElement(WebElement element, String text){
        element.sendKeys(text);
    }

    /**
     * This method will get text on element
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

}
