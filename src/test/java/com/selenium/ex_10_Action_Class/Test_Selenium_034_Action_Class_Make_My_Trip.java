package com.selenium.ex_10_Action_Class;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static com.selenium.ex_07_Selenium_Waits_Helper.Test_Selenium_029_Wait_Helper.wait_JVM;

public class Test_Selenium_034_Action_Class_Make_My_Trip extends Test_Case_Boiler_Plate {

    @Test
    public void make_my_trip(){
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));


        WebElement webElement = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        webElement.click();

        WebElement from_city = driver.findElement(By.xpath("//label[@for=\"fromCity\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(from_city).click().sendKeys("BOM").build().perform();

        wait_JVM(3000);

        List <WebElement> elementList = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li[1]"));

        for (WebElement li : elementList){
            if (li.getText().contains("Mumbai"));
            li.click();
        }



    }
}
