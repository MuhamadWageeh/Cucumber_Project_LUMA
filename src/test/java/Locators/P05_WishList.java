package Locators;

import StepDefinitions.T04_WishList;
import StepDefinitions.T04_WishList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P05_WishList {

    public WebElement HoverCardLoc()
    {
        return T04_WishList.driver.findElement(By.className("product-image-photo"));
    }
    public WebElement AddtoWishlistLoc() {
        return T04_WishList.driver.findElement(By.className("towishlist"));
    }
    public WebElement LoginLoc() {
        return T04_WishList.driver.findElement(By.className("page-title-wrapper"));
    }
    public WebElement MyWishListLoc() {
        return T04_WishList.driver.findElement(By.className("page-title"));
    }
    public WebElement SignInLoc () {
        return T04_WishList.driver.findElement(By.linkText("Sign In"));
    }
    public WebElement UsernameLoc() {
        return T04_WishList.driver.findElement(By.name("login[username]"));
    }
    public WebElement PasswordLoc() {
        return T04_WishList.driver.findElement(By.name("login[password]"));
    }
    public WebElement LoginButtonLoc() {
        return T04_WishList.driver.findElement(By.className("primary"));
    }






}


