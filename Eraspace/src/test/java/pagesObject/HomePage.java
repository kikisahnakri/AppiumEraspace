package pagesObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private AppiumDriver<MobileElement> driver;

    // Define elements locators
    private By LandingfeaturePromo = By.xpath("//android.widget.TextView[@text='Promo']");
    private By LandingfeatureBrand = By.xpath("//android.widget.TextView[@text='Brand']");
    private By LandingfeatureJasaServiceGadget = By.xpath("//android.widget.TextView[@text='Jasa Servis Gadget']");
    private By LandingfeatureClickPickUp = By.xpath("//android.widget.TextView[@text='Click & PickUp']");
    private By LandingfeatureBantuanBelanja = By.xpath("//android.widget.TextView[@text='Bantuin Belanja']");
    private By LandingfeatureKategori = By.xpath("//android.widget.TextView[@text='Kategori']");
    private By LandingfeatureToko = By.xpath("//android.widget.TextView[@text='Toko']");
    private By LandingfeatureWishlist = By.xpath("//android.widget.TextView[@text='Wishlist']");
    private By LandingfeatureAkun = By.xpath("//android.widget.TextView[@text='Akun']");
    private By LandingfeatureMobilePhone = By.xpath("//android.widget.TextView[@text='Mobile Phone']");
    private By LandingfeatureMobileAccessoris = By.xpath("//android.widget.TextView[@text='Mobile Accessories']");
    private By LandingfeatureTabletAccessoris = By.xpath("//android.widget.TextView[@text='Tablet Accessories']");
    private By LandingfeatureTablet = By.xpath("//android.widget.TextView[@text='Tablet']");
    private By LandingfeatureWearable = By.xpath("//android.widget.TextView[@text='Wearable']");
  //  private By LandingfeatureBarcode = By.xpath("//android.widget.TextView[@text='Tablet Accessories']");
    private By LandingfeatureCheckPoint = By.xpath("//android.widget.TextView[@text='Cek Poin']");
    private By LandingfeatureCrew = By.xpath("//android.widget.TextView[@text='Crew']");

    public HomePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;

    }
    public String getMenuPromo() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeaturePromo)).getText();
    }

    public String getMenuBrand() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureBrand)).getText();
    }

    public String getMenuJasaServices() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureJasaServiceGadget)).getText();
    }

    public String getMenuClickPickUp() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureClickPickUp)).getText();
    }

    public String getMenuBantuan() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureBantuanBelanja)).getText();
    }

    public String getMenuKategori() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureKategori)).getText();
    }

    public String getMenuToko() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureToko)).getText();
    }

    public String getMenuWishList() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureWishlist)).getText();
    }

    public String getMenuMobilePhone() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureMobilePhone)).getText();
    }

    public String getMenuMobileAcc() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureMobileAccessoris)).getText();
    }
    public String getMenuTabletAcc() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureTabletAccessoris)).getText();
    }

    public String getMenuTablet() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureTablet)).getText();
    }

    public String getMenuWearable() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureWearable)).getText();
    }

    public String getMenuCheckPoint() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureCheckPoint)).getText();
    }

    public String getMenuCrew() {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        return wait.until(ExpectedConditions.elementToBeClickable(LandingfeatureCrew)).getText();
    }

}
