package com.selenium.ex_15_Relative_Locators;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

import static com.selenium.ex_07_Selenium_Waits_Helper.Test_Selenium_029_Wait_Helper.wait_JVM;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Test_Selenium_044_RL extends Test_Case_Boiler_Plate {

    @Test
    public void test_rl(){

        driver.get("https://www.aqi.in/world-most-polluted-cities");
        driver.manage().window().maximize();

        WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        search.sendKeys("India" + Keys.ENTER);

        wait_JVM(5000);

        List<WebElement> locations = driver.findElements(By.cssSelector("div.location-name > p"));
        for (WebElement location : locations) {
            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("div")).toRightOf(location)).getText();

            System.out.println("| " + rank + "| " + location.getText() + "| " + aqi);

        }

    }
}
