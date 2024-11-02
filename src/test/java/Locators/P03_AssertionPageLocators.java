package Locators;

import StepDefinitions.T01_Register;
import StepDefinitions.T02_Login;
import StepDefinitions.T03_LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_AssertionPageLocators {

    public WebElement ThisIsaRF()
    {
        return T01_Register.driver.findElement(By.id("password-confirmation-error"));
    }
    public WebElement PleseeE()
    {
        return T01_Register.driver.findElement(By.id("password-confirmation-error"));
    }
    public WebElement Welcome()
    {
        return T02_Login.driver.findElement(By.cssSelector("span[data-bind=\"text: new String('Welcome, %1!').replace('%1', customer().fullname)\"]"));
    }

    public WebElement SuccessAddtoCart()
    {
        return T03_LandingPage.driver.findElement(By.xpath("//div[@data-ui-id=\"message-success\"]"));
    }
    public WebElement ShowCart()
    {
        return T03_LandingPage.driver.findElement(By.className("showcart"));
    }


}
