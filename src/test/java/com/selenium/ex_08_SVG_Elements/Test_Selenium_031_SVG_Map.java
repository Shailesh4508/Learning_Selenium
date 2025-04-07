package com.selenium.ex_08_SVG_Elements;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static com.selenium.ex_07_Selenium_Waits_Helper.Test_Selenium_029_Wait_Helper.checkVisibility;
import static com.selenium.ex_07_Selenium_Waits_Helper.Test_Selenium_029_Wait_Helper.wait_JVM;

public class Test_Selenium_031_SVG_Map {
    EdgeDriver driver;



    @BeforeTest
    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }


    @Description("Verify Tripura is present in the map and click to zoom it.")
    @Test
    public void  test_India_map_SVG(){
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
        wait_JVM(3000);

        List<WebElement> states = driver.findElements(By.xpath("//*[name() = 'svg']/*[name() = 'g'] [7]/*[name() = 'g']/*[name() = 'g']/*[name() = 'path']"));
        for (WebElement state : states){
            System.out.println(state.getDomAttribute("aria-label"));
            if (state.getDomAttribute("aria-label").contains("Uttar Pradesh  ")){
                state.click();
            }
        }


        }



    @AfterTest
    public void closeBrowser() {
        wait_JVM(5000);
        driver.quit();
    }
}