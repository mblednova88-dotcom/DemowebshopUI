package de.demowebshop.core;

import de.demowebshop.core.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(
            System.getProperty("browser", Browser.CHROME.browserName())
    );

    Logger logger = LoggerFactory.getLogger(TestBase.class);


    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

    @BeforeMethod
    public void startTest(){
        logger.info("Start test");
    }
    @AfterMethod
    public void stopTest(ITestResult result){
        if(result.isSuccess()){
            logger.info("PASSED: {}",result.getMethod().getMethodName());
        }else {
            logger.error("FAILD: {}. Screenshot ->{}",result.getMethod().getMethodName(),
            app.getUser().takeScreenshot());
        }
        logger.info("Stop test");
        logger.info("*******************************************************");
    }

}

