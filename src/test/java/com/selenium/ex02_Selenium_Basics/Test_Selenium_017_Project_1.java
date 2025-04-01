package com.selenium.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_017_Project_1 {

    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test
    public void negative_VWO_Login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/");

        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        Thread.sleep(5000);

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
