package com.selenium.ex_16_Selenium_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Selenium_046_StaleElementReferenceException {

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

        driver.get("https://google.com/");
        System.out.println("Start of a Program");

        WebElement search_input_box = driver.findElement(By.cssSelector("[id=\"APjFqb\"]"));

        driver.navigate().refresh();

        try {
            search_input_box.sendKeys("Youtube"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");
        }

        System.out.println("End of the Program");

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
