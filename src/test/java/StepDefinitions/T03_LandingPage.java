package StepDefinitions;

import Locators.P01_HomePageLocators;
import Locators.P03_AssertionPageLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class T03_LandingPage {

    P01_HomePageLocators HLoc = new P01_HomePageLocators();
    P03_AssertionPageLocators AssLoc = new P03_AssertionPageLocators();

    public static ChromeDriver driver;

    @Given("user open a new browser")
    public void user_open_a_new_browser()
    {
        driver = new ChromeDriver();
    }
    @And("user open a new website url")
    public void user_open_a_new_website_url()
    {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user Scroll Down to Hot Sellers Section")
    public void user_Scroll_Down_to_Hot_Sellers_Section()
    {
        JavascriptExecutor JSE = (JavascriptExecutor) driver;
        JSE.executeScript("window.scrollBy(0,2000)");
    }
    @And("user Observe each card is displayed with Price")
    public void user_Observe_each_card_is_displayed_with_Price()
    {
        for (int i = 0 ; i<6 ; i++)
        {
            System.out.println(driver.findElements(By.xpath("//span[@class=\"price\"]")).get(i).getText());
        }

    }
    @Then("Each card should display price in dollar")
    public void Each_card_should_display_price_in_dollar()
    {
        for (int i = 0 ; i<6 ; i++)
        {
            Assert.assertTrue(driver.findElements(By.xpath("//span[@class=\"price\"]")).get(i).getText().contains("$"));
        }
    }
    @And("user Observe each card contains Add to Cart")
    public void user_Observe_each_card_contains_Add_to_Cart()
    {
        for (int A=0 ; A < 6 ; A++) {
            System.out.println(driver.findElements(By.xpath("//span[text()=\"Add to Cart\"]")).get(A).getText());
            boolean a = driver.findElements(By.xpath("//span[text()=\"Add to Cart\"]")).get(A).isDisplayed();
            SoftAssert AddSoft = new SoftAssert();
            AddSoft.assertTrue(a);
        }
    }
    @Then("Each card should display Add to Cart button and it should be clickable")
    public void Each_card_should_display_Add_to_Cart_button_and_it_should_be_clickable()
    {
        for (int A=0 ; A < 6 ; A++)
        {
            SoftAssert AddSoft = new SoftAssert();
            AddSoft.assertTrue(driver.findElements(By.xpath("//span[text()=\"Add to Cart\"]")).get(A).isEnabled());

        }
    }
    @And("user Hover on Card Breathe Easy Tank")
    public void user_Hover_on_Card_Breathe_Easy_Tank()
    {
        Actions act = new Actions(driver);
        act.moveToElement(HLoc.Hover1()).perform();
    }
    @And("user Select Size M")
    public void user_Select_Size_M()
    {
        HLoc.GetSize().click();
    }
    @And("user Select Color")
    public void user_Select_Color()
    {
        HLoc.GetColor().click();
    }
    @And("user Click on Add to Cart button")
    public void user_Click_on_Add_to_Cart_button()
    {
        HLoc.AddtoCart().click();
    }
    @Then("Product should be added to cart successfully")
    public void Product_should_be_added_to_cart_successfully()
    {
        SoftAssert Soft = new SoftAssert();
        Soft.assertTrue(AssLoc.SuccessAddtoCart().isDisplayed());
    }
    @Then("Cart icon should display number 1")
    public void Cart_icon_should_display_number_1()
    {
        SoftAssert Soft = new SoftAssert();
        Soft.assertTrue(AssLoc.ShowCart().isDisplayed());
        Soft.assertAll();
    }
}

