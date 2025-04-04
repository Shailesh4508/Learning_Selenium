package com.selenium.ex06_Selenium_Input_Alert_Selet_Radio_Checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;


public class Test_Selenium_028_Alerts {
    public static void main(String[] args) throws InterruptedException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        //JS Alert
//        WebElement element = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
//        element.click();

        // JS Confirm
//        WebElement element1 = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
//        element1.click();

        //JS Prompt
        WebElement element2 = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        element2.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("I have clicked for JS Prompt");
        alert.accept();
//        alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
//        Assert.assertEquals(result,"Ok");
        Assert.assertEquals(result,"You entered: I have clicked for JS Prompt");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();


    }
}
