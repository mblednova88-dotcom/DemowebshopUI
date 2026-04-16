package de.demowebshop.fw;

import de.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void openLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillLoginForm(String email, String password) {
        type(By.name("Email"), email);
        type(By.name("Password"), password);
    }

    public void submitLogin() {
        click(By.cssSelector("[value='Log in']"));
    }


    public void register(String email, String password) {
        click(By.linkText("Register"));
        click(By.id("gender-female"));
        type(By.name("FirstName"), "Marina");
        type(By.name("LastName"), "Test");
        type(By.name("Email"), email);
        type(By.name("Password"), password);
        type(By.name("ConfirmPassword"), password);
        click(By.id("register-button"));
    }
    public void openRegister() {
        click(By.cssSelector("[href='/register']"));
    }

    public void fillRegistrationForm(String email, String password) {
        type(By.name("Email"), email);
        type(By.name("Password"), password);
        type(By.name("ConfirmPassword"), password);
    }

    public void submitRegistration() {
        click(By.id("register-button"));
    }

    //public boolean isRegistrationSuccess() {
    //    return isElementPresent(By.cssSelector(".result"));
    //}
    public boolean isSignOutButtonPresent() {
        return isElementPresent(By.cssSelector("[href='/logout']"));
    }
    //public  boolean isLoginSuccess(){
    //    return isElementPresent(By.cssSelector("[href='/logout']"));
    //}
    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector(".header-links"));
    }
}