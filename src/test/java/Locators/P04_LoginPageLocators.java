package Locators;

import StepDefinitions.T02_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_LoginPageLocators {
    public WebElement LoginEmail()
    {
        return T02_Login.driver.findElement(By.id("email"));
    }
    public WebElement LoginPassword()
    {
        return  T02_Login.driver.findElement(By.name("login[password]"));
    }
    public  WebElement SignIn()
    {
        return T02_Login.driver.findElement(By.cssSelector("button[class=\"action login primary\"]"));
    }
}
