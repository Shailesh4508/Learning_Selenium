package com.selenium.ex_12_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static com.selenium.ex_07_Selenium_Waits_Helper.Test_Selenium_029_Wait_Helper.wait_JVM;

public class Test_Selenium_039_Interview_Questions {

    public EdgeDriver driver;

    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        edgeOptions.addArguments("--size-Maximized");
        driver = new EdgeDriver(edgeOptions);

    }


    @Test
    public void test_interview_vwo_projects(){

        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        wait_JVM(5000);

        String parent_window_handle = driver.getWindowHandle();
        System.out.println(parent_window_handle);

        List <WebElement> list_heatmaps = driver.findElements(By.xpath("//*[@data-qa= 'yedexafobi']"));
        Actions actions = new Actions(driver);

        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();

        wait_JVM(15000);

       Set <String> all_handles = driver.getWindowHandles();
        System.out.println(all_handles);

        for (String handles : all_handles){
            if (!handles.equals(parent_window_handle)){
                driver.switchTo().window(handles);

                driver.switchTo().frame("heatmap-iframe");
                WebElement clickmap = driver.findElement(By.cssSelector("[data-qa= 'liqokuxuba']"));
                clickmap.click();
            }
        }


    }

    @AfterTest
    public void closeBrowser(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}

