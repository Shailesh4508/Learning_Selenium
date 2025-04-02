package com.selenium.ex03_Selenium_Basics;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_019_Mini {

    @Owner("Shailesh Singh")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trial_error_verify(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("Start"));
        a_tag_partial_match.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement check_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        check_policy.click();

        List<WebElement> button_list = driver.findElements(By.tagName("Button"));
        button_list.get(0).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> error_message = driver.findElements(By.className("invalid-reason"));
        Assert.assertEquals(error_message.get(0).getText(),"The email address you entered is incorrect.");

        driver.quit();
    }
}
