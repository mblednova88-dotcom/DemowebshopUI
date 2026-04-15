package de.demowebshop.core;

import de.demowebshop.fw.ItemHelper;import de.demowebshop.fw.UserHelper;import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {

    WebDriver driver;

    UserHelper user;
    ItemHelper item;

    // запуск браузера
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();

        user = new UserHelper(driver);
        item = new ItemHelper(driver);
    }

    // закрытие браузера
    public void stop() {
        driver.quit();
    }

    // геттер для UserHelper
    public UserHelper getUser() {
        return user;
    }

    // геттер для ItemHelper
    public ItemHelper getItem() {
        return item;
    }
}