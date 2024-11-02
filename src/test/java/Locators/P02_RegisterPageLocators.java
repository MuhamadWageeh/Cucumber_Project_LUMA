package Locators;

import StepDefinitions.T01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_RegisterPageLocators {

    public WebElement Firstname()
    {
        return T01_Register.driver.findElement(By.name("firstname"));
    }
    public WebElement Lastname()
    {
        return  T01_Register.driver.findElement(By.id("lastname"));
    }
    public WebElement Email()
    {
        return T01_Register.driver.findElement(By.name("email"));
    }
    public WebElement Password()
    {
        return T01_Register.driver.findElement(By.id("password"));
    }
    public WebElement CAButton()
    {
        return T01_Register.driver.findElement(By.cssSelector("button[title=\"Create an Account\"]"));
    }
    public WebElement PasswordConfirmation()
    {
        return T01_Register.driver.findElement(By.id("password-confirmation"));
    }



}
