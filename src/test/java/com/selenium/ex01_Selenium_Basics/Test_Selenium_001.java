package com.selenium.ex01_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_Selenium_001 {

    @Test
    public void test_verify_VWO_Login(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://app.VWO.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getSessionId());
        driver.quit();
    }
}
