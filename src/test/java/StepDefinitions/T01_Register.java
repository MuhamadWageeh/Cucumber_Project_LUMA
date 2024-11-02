package StepDefinitions;

import Locators.P01_HomePageLocators;
import Locators.P02_RegisterPageLocators;
import Locators.P03_AssertionPageLocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class T01_Register {
    public static ChromeDriver driver;
    P01_HomePageLocators HLoc = new P01_HomePageLocators();
    P02_RegisterPageLocators RLoc = new P02_RegisterPageLocators();
    P03_AssertionPageLocators AssLoc = new P03_AssertionPageLocators();

    @Given("user open browser")
    public void user_open_browser()
    {
        driver = new ChromeDriver();
    }
    @And("user open website url")
    public void user_open_website_url()
    {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user Click on Create an Account")
    public void user_Click_on_Create_an_Account()
    {
       HLoc.CreateAnAccount().click();
    }
    @And("user enters first name")
    public void user_enters_first_name()
    {
        RLoc.Firstname().sendKeys("Mohamed");
    }
    @And("user enters last name")
    public void user_enters_last_name()
    {
        RLoc.Lastname().sendKeys("Wageeh");
    }
    @And("user enters email")
    public void user_enters_email()
    {
        RLoc.Email().sendKeys("muhamad.wageeh@gmail.com");
    }
    @And("user enters password")
    public void user_enters_password()
    {
        RLoc.Password().sendKeys("Mohamed@2961992");
    }
    @And("user Click on Create an Account button")
    public void user_Click_on_Create_an_Account_button()
    {
        RLoc.CAButton().click();
    }
    @Then("User navigated to  create an account page")
    public void User_navigated_to_create_an_account_page()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://magento.softwaretestingboard.com/customer/account/create/"));
    }
    @Then("error message will be displayed")
    public void error_message_will_be_displayed()
    {
        boolean x = AssLoc.ThisIsaRF().getText().contains("This is a required field.");
        Assert.assertTrue(x);
    }
    @And("user enters Confirm Password does not match Password")
    public void user_enters_Confirm_Password_does_not_match_Password()
    {
        RLoc.PasswordConfirmation().sendKeys("2691992");
    }
    @Then("Please enter the same value again error will be displayed")
    public void Please_enter_the_same_value_again_error_will_be_displayed()
    {
        boolean y = AssLoc.PleseeE().getText().contains("Please enter the same value again.");
        Assert.assertTrue(y);
    }
    @And("user enters Confirm Password match Password")
    public void user_enters_Confirm_Password_match_Password()
    {
        RLoc.PasswordConfirmation().sendKeys("Mohamed@2961992");
    }
    @Then("User navigated to customer account page")
    public void User_navigated_to_customer_account_page()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://magento.softwaretestingboard.com/customer/account/"));
    }
    @Then("In Contact Information user data is the same as user input during registration")
    public void In_Contact_Information_user_data_is_the_same_as_user_input_during_registration()
    {

        String actualFirstName = RLoc.Firstname().getAttribute("value");
        Assert.assertEquals("Mohamed", actualFirstName);


        String actualLastName = RLoc.Lastname().getAttribute("value");
        Assert.assertEquals("Wageeh",actualLastName );


        String actualEmail = RLoc.Email().getAttribute("value");
        Assert.assertEquals("muhamad.wageeh@gmail.com",actualEmail);
    }







}
