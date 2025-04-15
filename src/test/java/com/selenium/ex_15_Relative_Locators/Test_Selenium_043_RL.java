package com.selenium.ex_15_Relative_Locators;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Test_Selenium_043_RL extends Test_Case_Boiler_Plate {

    @Test
    public void test_rl(){
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        WebElement element = driver.findElement(By.xpath("//*[@id=\"form\"]/button"));
        element.click();

        WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement error_username = driver.findElement(with(By.tagName("small")).below(username));

        String error_text = error_username.getText();
        Assert.assertEquals(error_text,"Username must be at least 3 characters");
    }


}
