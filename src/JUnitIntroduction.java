import org.junit.*;

/**
 * Created by Jay
 */
public class JUnitIntroduction {

    @BeforeClass
    public static void connection(){
        System.out.println("DB connection");
    }

    @AfterClass
    public static void closeConnection(){
        System.out.println("Close connection");
    }

    @Before
    public void openBrowser(){
        System.out.println("Open Browser");
    }


    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        System.out.println("Navigate to Login page");
    }

    @Test
    public void verifyUserShouldNavigateToRegistrationPageSuccessfully(){
        System.out.println("Navigate to Register page");

    }

    @After
    public void closeBrowser(){
        System.out.println("Close browser");
    }


}
