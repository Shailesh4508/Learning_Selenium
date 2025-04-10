package com.selenium.ex_12_Windows;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Set;

public class Test_Selenium_038_Windows extends Test_Case_Boiler_Plate {

    @Test
    public void test_window(){

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        driver.findElement(By.linkText("Click Here")).click();

        Set <String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for (String handles : windowHandles){
            driver.switchTo().window(handles);
            if (driver.getPageSource().contains("New Window")){
                System.out.println("Passed");
            }
            driver.switchTo().window(parent);
        }



    }
}
