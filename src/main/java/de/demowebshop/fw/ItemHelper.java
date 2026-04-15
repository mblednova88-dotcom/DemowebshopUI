package de.demowebshop.fw;

import de.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {

    public ItemHelper(WebDriver driver) {
        super(driver);
    }


    public void addSecondItemToCart() {
        click(By.cssSelector(".product-item:nth-child(2) .product-box-add-to-cart-button"));
    }


    public void openCart() {
        click(By.cssSelector("[href='/cart']"));
    }


    public boolean isItemInCart() {
        return isElementPresent(By.cssSelector(".cart-item-row"));
    }

    }

