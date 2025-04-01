package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_10 {

    @Description("Open the Url")
    @Test
    public void test_selenium() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is Available");
            Assert.assertTrue(true);
        }
        else {
//            Assert.assertTrue(false);
            throw new Exception("CURA Healthcare Service is not Available");
        }

        driver.quit();
    }
}