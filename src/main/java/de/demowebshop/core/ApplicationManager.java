package de.demowebshop.core;

import de.demowebshop.fw.ItemHelper;import de.demowebshop.fw.UserHelper;import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ApplicationManager {

    String browser;
    WebDriver driver;

    UserHelper user;
    ItemHelper item;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }



    public void init() {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Неизвестный браузер: " + browser
                    + ". Доступные значения: chrome, edge");
        }




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