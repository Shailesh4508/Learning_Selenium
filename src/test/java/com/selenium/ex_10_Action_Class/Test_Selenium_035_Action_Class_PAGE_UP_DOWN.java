package com.selenium.ex_10_Action_Class;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_Selenium_035_Action_Class_PAGE_UP_DOWN extends Test_Case_Boiler_Plate {

    @Test
    public void test_page_up_down(){

        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();
    }
}
