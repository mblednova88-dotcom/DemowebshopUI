package de.demowebshop;

import de.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginTest() {

        app.getUser().openLogin();
        app.getUser().fillLoginForm("mariulka88@mail.ru", "Aa12345!");
        app.getUser().submitLogin();

        Assert.assertTrue(app.getUser().isLoginSuccess());
    }
}