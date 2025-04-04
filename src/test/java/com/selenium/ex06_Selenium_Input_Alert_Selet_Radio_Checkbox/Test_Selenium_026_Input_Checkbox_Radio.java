package com.selenium.ex06_Selenium_Input_Alert_Selet_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_Selenium_026_Input_Checkbox_Radio {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");

        //Input Box
        driver.findElement(By.name("firstname")).sendKeys("Shailesh");

        driver.findElement(By.name("lastname")).sendKeys("Singh");

        //Radio
        driver.findElement(By.id("sex-0")).click();

        //Check-box
        driver.findElement(By.id("exp-6")).click();

        driver.quit();
    }
}
