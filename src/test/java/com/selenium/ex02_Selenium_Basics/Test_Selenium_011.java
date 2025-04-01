package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_011 {

    @Description("Open the Url")
    @Test
    public void test_selenium() throws Exception {

        ChromeDriver driver = new ChromeDriver();
//        driver = new FirefoxDriver();


        WebDriver driver1 = new EdgeDriver();
        driver1 = new ChromeDriver();

    }
}
