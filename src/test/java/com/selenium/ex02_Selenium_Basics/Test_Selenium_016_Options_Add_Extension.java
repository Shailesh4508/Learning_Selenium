package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Test_Selenium_016_Options_Add_Extension{

    @Description("Options Class")
    @Test
    public void test_Selenium() throws Exception{

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("window-size-1920-1080");
        edgeOptions.addExtensions(new File("src/test/java/com/selenium/ex02_Selenium_Basics/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));


        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=C7BeFLqZRMY");
        driver.manage().deleteAllCookies();  //Use to delete all the cookies
    }
}