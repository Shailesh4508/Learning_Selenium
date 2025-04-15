package com.selenium.ex_16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_048_TimeoutException {

    public EdgeDriver driver;

    @BeforeTest
    public void before_test(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--size-Maximized");
        driver = new EdgeDriver(edgeOptions);
    }


    @Test
    public void exception(){


        System.out.println("Start of a Program");

        driver.get("https://google.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//textarea[@id='abc'")));


        WebElement search_input_box1 = driver.findElement(By.cssSelector("[id=\"APjFqb\"]"));
        search_input_box1.sendKeys("Chatgpt"+ Keys.ENTER);

        System.out.println("End of a Program");

    }




    @AfterTest
    public void after_browser(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
