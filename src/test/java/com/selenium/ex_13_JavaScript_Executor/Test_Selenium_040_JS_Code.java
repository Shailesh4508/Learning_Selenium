package com.selenium.ex_13_JavaScript_Executor;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_Selenium_040_JS_Code extends Test_Case_Boiler_Plate {

    @Test
    public void test_JS_Code(){
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//*[@id=\"userName\"]"));

        js.executeScript("window.scrollBy(0, 500);");

        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);
    }
}
