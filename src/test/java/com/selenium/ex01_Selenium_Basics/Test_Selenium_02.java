package com.selenium.ex01_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Test_Selenium_02 {

    @Description("Verify the title by opening app.VWO.com")
    @Test
    public void test_Selenium02(){
        EdgeDriver driver = new EdgeDriver();
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX), Create New Session Endpoint

        // Navigate the URL -> get the URL

        driver.get("https://app.vwo.com/#/login");

        // Assert the URL - Validation - TestNG Assertions
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();
    }


}
