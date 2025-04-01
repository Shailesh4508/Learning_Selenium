package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_08_Minimize_Maximize_Page {

    @Description("Open the Url")
    @Test
    public void test_Selenium(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.VWO.com");

        //Minimize and Maximize Commands//

        driver.manage().window().maximize();
        driver.manage().window().minimize();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
