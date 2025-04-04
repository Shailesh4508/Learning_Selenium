package com.selenium.ex05_Selenium_Waits;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test_Selenium_023_Fix_Mini_Project {
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_login_negative() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        // Implicit Wait Eg
//        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("Start"));
        a_tag_partial_match.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement check_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        check_policy.click();

        List<WebElement> button_list = driver.findElements(By.tagName("Button"));
        button_list.get(0).click();

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Explicit Wait Eg
        // until this notification displayed or visible we have to wait for max = 3
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("invalid-reason")));


        List<WebElement> error_message = driver.findElements(By.className("invalid-reason"));
//        wait.until(ExpectedConditions.textToBePresentInElement((WebElement) error_message,"The email address you entered is incorrect."));
        Assert.assertEquals(error_message.get(0).getText(),"The email address you entered is incorrect.");


        driver.quit();


    }
}