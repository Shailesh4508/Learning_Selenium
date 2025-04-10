package com.selenium.ex_11_File_Upload;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_Selenium_037_File_Upload {

    @Test
    public void test_file_upload(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement upload = driver.findElement(By.id("fileToUpload"));

        upload.sendKeys("C:\\Users\\shail\\Downloads\\Screenshot 2025-02-20 125702.png");
        driver.findElement(By.name("submit")).click();


    }
}
