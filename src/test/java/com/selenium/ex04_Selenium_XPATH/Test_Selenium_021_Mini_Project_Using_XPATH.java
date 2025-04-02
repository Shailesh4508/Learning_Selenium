package com.selenium.ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class Test_Selenium_021_Mini_Project_Using_XPATH {

    // https://katalon-demo-cura.herokuapp.com/

    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_katalon_login() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--size-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com");

        WebElement make_appointment_button = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_button.click();

//        WebElement username_input_box_id = driver.findElement(By.id("txt-username"));
//        WebElement username_input_box_name = driver.findElement(By.name("username"));

//        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//        username.sendKeys("John Doe");

        List <WebElement> username_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_placeholder.get(1).sendKeys("John Doe");

        List <WebElement> password_class = driver.findElements(By.xpath("//input[@class='form-control']"));
        password_class.get(3).sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        login_button.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        driver.quit();


    }
}
