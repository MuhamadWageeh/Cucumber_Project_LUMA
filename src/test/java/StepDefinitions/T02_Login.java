package StepDefinitions;

import Locators.P01_HomePageLocators;
import Locators.P03_AssertionPageLocators;
import Locators.P04_LoginPageLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class T02_Login {

    public static ChromeDriver driver;
    P01_HomePageLocators HLoc= new P01_HomePageLocators();
    P03_AssertionPageLocators AssLoc = new P03_AssertionPageLocators();
    P04_LoginPageLocators LLoc = new P04_LoginPageLocators();

    @Given("user open new browser")
    public void user_open_new_browser()
    {
        driver = new ChromeDriver();
    }
    @And("user open new website url")
    public void user_open_new_website_url()
    {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @When("user click on sign in")
    public void user_click_on_sign_in()
    {
        HLoc.Login().click();
    }
    @And("user enters vaild email")
    public void user_enters_vaild_email()
    {
        LLoc.LoginEmail().sendKeys("muhamad.wageeh@gmail.com");
    }
    @And("user enters vaild password")
    public void user_enters_vaild_password()
    {
        LLoc.LoginPassword().sendKeys("Mohamed@2961992");
    }
    @And("user click on sign in button")
    public void user_click_on_sign_in_button()
    {
        LLoc.SignIn().click();
    }
    @Then("User navigated to homepage")
    public void User_navigated_to_homepage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://magento.softwaretestingboard.com/"));
    }
    @Then("welcome message should be displayed")
    public void welcome_message_should_be_displayed()
    {
        boolean z = AssLoc.Welcome().isDisplayed();
        Assert.assertTrue(z);
    }

}
