package de.demowebshop.fw;

import de.demowebshop.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {

    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    // FIX: На странице категории у товаров нет прямой кнопки "Add to cart" в списке —
    // нужно зайти на страницу конкретного товара и там нажать кнопку.
    // Переходим в Books, кликаем на второй товар, добавляем со страницы товара.
    public void openBooksCategory() {
        driver.get("https://demowebshop.tricentis.com/books");
    }

    public void addSecondItemToCart() {
        driver.get("https://demowebshop.tricentis.com/computing-and-internet");
        click(By.cssSelector(".add-to-cart-button"));
    }


    public void openCart() {
        click(By.cssSelector("[href='/cart']"));
    }

    public boolean isItemInCart() {
        return isElementPresent(By.cssSelector(".cart-item-row"));
    }
}