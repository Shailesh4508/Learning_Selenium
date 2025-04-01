package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Test_Selenium_015_Options {

        @Description("Open the URL")
        @Test
        public void test_Selenium01() throws Exception {

            ChromeOptions chromeOptions = new ChromeOptions();
            // FirefoxOptions, ChromeOptions, SafariOptions

            chromeOptions.addArguments("window-size-1080-780"); // will start on mentioned resolution
            chromeOptions.addArguments("Incognito"); // will start in Incognito
            chromeOptions.addArguments("start-maximized"); // will start in full maximized
            chromeOptions.addArguments("headless"); // will start execution with UI

            ChromeDriver driver = new ChromeDriver(chromeOptions);
            Thread.sleep(5000);
            driver.quit();

    }
}
