package com.selenium.ex_16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Selenium_045_NoSuchElementException {

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

        driver.get("https://app.vwo.com/");
        System.out.println("Start of a Program");

        try {
            driver.findElement(By.id("shailesh"));
        } catch (NoSuchElementException e) {
            System.out.println("Element Not Found");
        }

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
