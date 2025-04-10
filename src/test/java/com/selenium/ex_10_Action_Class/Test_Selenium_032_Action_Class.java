package com.selenium.ex_10_Action_Class;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Test_Selenium_032_Action_Class extends Test_Case_Boiler_Plate {

    @Test
    public void test_Action(){
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        //Keys Action Classes

        WebElement firstname = driver.findElement(By.name("firstname"));

        //KeyBoard

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(firstname,"Shailesh").keyUp(Keys.SHIFT).build().perform();
    }
}
