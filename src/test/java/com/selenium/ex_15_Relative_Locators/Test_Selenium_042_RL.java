package com.selenium.ex_15_Relative_Locators;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Test_Selenium_042_RL extends Test_Case_Boiler_Plate {

    @Test
    public void test_rl(){
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));

        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();

    }


}
