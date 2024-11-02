package Locators;

import StepDefinitions.T01_Register;
import StepDefinitions.T02_Login;
import StepDefinitions.T03_LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_HomePageLocators {

  public   WebElement CreateAnAccount()
    {
        return  T01_Register.driver.findElement(By.cssSelector("a[href=\"https://magento.softwaretestingboard.com/customer/account/create/\"]"));
    }
    public WebElement Login()
    {
        return T02_Login.driver.findElement(By.cssSelector("a[href=\"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/\"]"));
    }
    public WebElement Hover1()
    {
        return T03_LandingPage.driver.findElement(By.cssSelector("img[src=\"https://magento.softwaretestingboard.com/pub/media/catalog/product/cache/7c4c1ed835fbbf2269f24539582c6d44/w/t/wt09-white_main_1.jpg\"]"));
    }
    public WebElement GetSize()
    {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//div[text()=\"M\"]"));
    }
    public WebElement GetColor()
    {
        return T03_LandingPage.driver.findElement(By.xpath("//div[@option-label=\"Yellow\"]"));
    }
    public WebElement AddtoCart()
    {
        return T03_LandingPage.driver.findElement(By.xpath("//a[@title=\"Breathe-Easy Tank\"]//parent::strong//parent::div//span[text()=\"Add to Cart\"]"));
    }






}
