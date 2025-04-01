package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Test_Selenium_09 {

    @Description("Open the Url")
    @Test
    public void test_Selenium() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.VWO.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://app.vwo.com/#/login");

        driver.quit();
    }
}