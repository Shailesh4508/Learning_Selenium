package com.selenium.ex03_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Test_Selenium_018_By_linkText_and_partialLinkText {

    @Description("Verify VWO Login")
    @Test
    public void test_Login_VWO(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        // By.linkText
//        WebElement a_tag_free_trial_full_match = driver.findElement(By.linkText("Start a free trial"));
        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}
//        a_tag_free_trial_full_match.click();


        // By.partialLinkText
        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("Start"));
        // If the element locator matches with single word - then to it will be able to locate
        a_tag_partial_match.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
