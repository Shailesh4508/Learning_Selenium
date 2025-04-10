package com.selenium.ex_10_Action_Class;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_Selenium_033_Action_Class extends Test_Case_Boiler_Plate {


    @Test
    public void test_action(){

        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));


        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().sendKeys("BLR").build().perform();


    }
}
