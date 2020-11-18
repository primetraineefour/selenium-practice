import browsertesting.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Jay
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        // Finding the login link element and click on login link element
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));


        // This is expected text from Requirement
        String expectedMessage = "Welcome, Please Sign In!";

        /*// Finding the Welcome text element
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));

        // Get text from Welcome text element from web site
        String actualMessage = message.getText();*/

        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));

        // verifying actualText and expectedText
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyErrorMessageWhenWrongUserNameIsEntered() throws InterruptedException {
        // Finding the login link element and click on login link element
        /*WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();*/
        clickOnElement(By.linkText("Log in"));

        // Thread.slip method used for hold execution
        Thread.sleep(1000);

        // Finding the emailField element
        WebElement emailField = driver.findElement(By.id("Email"));

        // Send email address to emailField element
        emailField.sendKeys("abc@gmail.com");

        sendTextToElement(By.id("Email"),"abc@gmail.com");

        // Finding the passwordField element
        WebElement passwordField = driver.findElement(By.name("Password"));
        // Send password to passwordField element
        passwordField.sendKeys("Abc123");

        //Finding the login button element
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Log in']"));
        // Clicking on login button element
        loginBtn.click();

        //Finding element of error message
        WebElement errorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));

        // This is actual error message from web site
        String actualErrorMessage = errorMsg.getText();

        // This is expected message from Requirement
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";

        // Asserting expectedMessage and actualMessage
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
