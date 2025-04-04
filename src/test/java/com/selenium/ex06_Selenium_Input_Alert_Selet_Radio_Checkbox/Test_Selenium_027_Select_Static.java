package com.selenium.ex06_Selenium_Input_Alert_Selet_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Selenium_027_Select_Static {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();


        // Static Dropdown
        WebElement element_web = driver.findElement(By.id("dropdown"));
        Select select = new Select(element_web);
//        select.selectByIndex(2);
        select.selectByVisibleText("Option 2");
    }
}
