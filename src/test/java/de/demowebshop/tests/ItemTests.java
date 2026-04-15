package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getUser().openLogin();
        app.getUser().fillLoginForm("mariulka88@mail.ru", "Aa12345!");
        app.getUser().submitLogin();
    }

    @Test
    public void addItemToCartTest() {

        app.getItem().addSecondItemToCart();
        app.getItem().openCart();

        Assert.assertTrue(app.getItem().isItemInCart());
    }
}
