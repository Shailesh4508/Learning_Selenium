package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_012 {
    @Description("Open the Url")
    @Test
    public void test_selenium() throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL

        // Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        Thread.sleep(5000);

        driver.quit();

    }
}
