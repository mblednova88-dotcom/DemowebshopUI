package de.demowebshop.tests;

import de.demowebshop.core.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {


    @Test
    public void isHomeComponentPresentTest(){
        //System.out.println("home comp is "+ isHomeComponentPresent());
        Assert.assertTrue(app.getUser().isHomeComponentPresent());

    }


}
