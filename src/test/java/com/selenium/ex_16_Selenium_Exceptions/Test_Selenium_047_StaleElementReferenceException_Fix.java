package com.selenium.ex_16_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Selenium_047_StaleElementReferenceException_Fix {

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

        // When REACT application(SPA), they change the DOM structure) That is not in your hand.


        // HTML Page (DOM) is refreshed NOW,
        // Driver will think that, element may or may not available now.
        // I have found the element before refresh.

        // Refresh, Navigate other Page, change in DOM elements (Ajax Calls) - VueJS, AngularJS

        // If you want to fix the stale element exp - refind the element after DOM changes)
        //search_inputbox  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        try {
            search_input_box.sendKeys("Youtube"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            WebElement search_input_box1 = driver.findElement(By.cssSelector("[id=\"APjFqb\"]"));
            search_input_box1.sendKeys("Chatgpt"+ Keys.ENTER);
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
