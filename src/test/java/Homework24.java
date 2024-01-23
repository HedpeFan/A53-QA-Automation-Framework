import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework24 extends BaseTest {

    @Test
    public void loginWithCorrectCredentialsnew(){

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("azahn007@gmail.com");
        loginPage.providePassword("Koelpass");
        loginPage.clickSubmit();

        Assert.assertTrue(homePage.getUserAvatarIcon().isDisplayed());

    }
}
