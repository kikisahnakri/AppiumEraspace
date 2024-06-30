package pagesObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private AppiumDriver<MobileElement> driver;

    // Define elements locators
    private By masukButtonHomePage = By.id("com.eraspace.app.home:id/btnLogin");
    private By usernameField = By.id("com.eraspace.app.membership:id/edtPhoneOrEmail");
    private By passwordField = By.id("com.eraspace.app.membership:id/edtPassword");
    private By masukButton = By.id("com.eraspace.app.membership:id/btnLogin");
    private By messageError = By.id("com.eraspace.app:id/textinput_error");

    public LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.elementToBeClickable(masukButtonHomePage)).click();
        } catch (WebDriverException e) {
            System.out.println("WebDriverException occurred: " + e.getMessage());
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to go to login page", e);
        }
    }

    public void enterUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }

    public void enterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(messageError)).getText();
    }

    public void clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(masukButton)).click();
    }

    public void displaydLoginButton() {
        driver.findElement(masukButton).isDisplayed();
    }
}
