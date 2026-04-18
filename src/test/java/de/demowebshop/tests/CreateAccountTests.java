package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    @BeforeMethod
    public void ensurePrecondition() {
        if (app.getUser().isSignOutButtonPresent()) {
            app.getUser().clickOnSignOutButton();
        }
    }


    @Test
    public void newUserRegisterPositiveTest() {

        int i = (int) (System.currentTimeMillis() / 1000);
        String email = "test" + i + "@mail.com";
        app.getUser().clickOnLoginLink();
        app.getUser().openRegister();
        app.getUser().fillRegistrationForm(email, "Aa12345!");
        app.getUser().submitRegistration();

        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }
}