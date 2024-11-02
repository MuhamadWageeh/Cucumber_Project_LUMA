package StepDefinitions;

import Locators.P05_WishList;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T04_WishList {
    By wishlistloc = By.className("towishlist");
    P05_WishList WLocs = new P05_WishList();


    public static ChromeDriver driver;

    @Given("user open another browser")
    public void user_open_another_browser()
    {
        driver = new ChromeDriver();
    }
    @And("user open another website url")
    public void user_open_another_website_url()
    {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
    }
    @When("user Scroll Down to A Hot Sellers Section")
    public void user_Scroll_Down_to_A_Hot_Sellers_Section()
    {
        JavascriptExecutor JSE = (JavascriptExecutor) driver;
        JSE.executeScript("window.scrollBy(0,3500)");
    }
    @And("user Hover on any card and click on Add to Wishlist button")
    public void user_Hover_on_any_card_and_click_on_Add_to_Wishlist_button()
    {
        Actions act = new Actions(driver);
        act.moveToElement(WLocs.HoverCardLoc()).perform();

        WebDriverWait Expwait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Expwait.until(ExpectedConditions.presenceOfElementLocated(wishlistloc));

        WLocs.AddtoWishlistLoc().click();
    }
    @Then("User should be navigated to login page again")
    public void  User_should_be_navigated_to_login_page_again()
    {
        boolean r = WLocs.LoginLoc().getText().contains("Login");
        SoftAssert ssoft = new SoftAssert();
        ssoft.assertTrue(r);
        ssoft.assertAll();
    }
    @When("User logging in")
    public void User_logging_in()
    {
        WLocs.SignInLoc().click();
        WLocs.UsernameLoc().sendKeys("sandra.sgorgi@gmail.com");
        WLocs.PasswordLoc().sendKeys("12345StrongPassword");
        WLocs.LoginButtonLoc().click();
    }
    @Then("User should be navigated to My Wishlist page with the same product")
    public void User_should_be_navigated_to_My_Wishlist_page_with_the_same_product()
    {
        boolean s = WLocs.MyWishListLoc().isDisplayed();
        SoftAssert ysoft = new SoftAssert();
        ysoft.assertTrue(s);

        boolean h = WLocs.HoverCardLoc().isDisplayed();
        SoftAssert zsoft = new SoftAssert();
        zsoft.assertTrue(h);
        zsoft.assertAll();
    }


}
