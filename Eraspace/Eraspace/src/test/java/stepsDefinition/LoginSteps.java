package stepsDefinition;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pagesObject.HomePage;
import pagesObject.LoginPage;
import utils.Hooks;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    private AppiumDriver<MobileElement> driver;
    private LoginPage loginPage;
    private HomePage homePage;

    public LoginSteps() {
        this.driver = Hooks.getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Given("User is on login page")
    public void userIsOnLoginPage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        loginPage.goToLoginPage();
    }

    @When("User input username {string} and password {string}")
    public void userInputUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("User should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String message) {
        String actualMessage= loginPage.getErrorMessage();
        Assert.assertEquals(message,actualMessage);
    }

    @Then("Successfully login user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
       String actualPromo= homePage.getMenuPromo();
       Assert.assertEquals("Promo",actualPromo);

       String actualBrand= homePage.getMenuBrand();
       Assert.assertEquals("Brand",actualBrand);

        String actualJasa= homePage.getMenuJasaServices();
        Assert.assertEquals("Jasa Servis Gadget",actualJasa);

        String actualPickup= homePage.getMenuClickPickUp();
        Assert.assertEquals("Click & PickUp",actualPickup);

        String actualBantuan= homePage.getMenuBantuan();
        Assert.assertEquals("Bantuin Belanja",actualBantuan);

        String actualMobile= homePage.getMenuMobilePhone();
        Assert.assertEquals("Mobile Phone",actualMobile);

        String actualMobileAcc= homePage.getMenuMobileAcc();
        Assert.assertEquals("Mobile Accessories",actualMobileAcc);

        String actualTablet= homePage.getMenuTablet();
        Assert.assertEquals("Tablet",actualTablet);

        String actualTabAcc= homePage.getMenuTabletAcc();
        Assert.assertEquals("Tablet Accessories",actualTabAcc);

        String actualWearable= homePage.getMenuWearable();
        Assert.assertEquals("Wearable",actualWearable);

        String actualKategori= homePage.getMenuKategori();
        Assert.assertEquals("Kategori",actualKategori);

        String actualToko= homePage.getMenuToko();
        Assert.assertEquals("Toko",actualToko);

        String actualWishList= homePage.getMenuWishList();
        Assert.assertEquals("Wishlist",actualWishList);

        String actualMenuCrew= homePage.getMenuCrew();
        Assert.assertEquals("Crew",actualMenuCrew);

        String actualCheckPoint= homePage.getMenuCheckPoint();
        Assert.assertEquals("Cek Poin",actualCheckPoint);

    }

    @And("User can't clicks on login button")
    public void userCanTClicksOnLoginButton() {
        loginPage.displaydLoginButton();
    }
}
