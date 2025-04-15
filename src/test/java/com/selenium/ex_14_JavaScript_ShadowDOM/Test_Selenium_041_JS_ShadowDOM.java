package com.selenium.ex_14_JavaScript_ShadowDOM;

import com.selenium.Test_Case_Boiler_Plate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.selenium.ex_07_Selenium_Waits_Helper.Test_Selenium_029_Wait_Helper.wait_JVM;

public class Test_Selenium_041_JS_ShadowDOM extends Test_Case_Boiler_Plate {

    @Test
    public void test_js(){

        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//*[@id=\"userName\"]"));

        //ShadowDOM --> JS Execute Code

        wait_JVM(3000);

        WebElement input_pizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\")");
        input_pizza.sendKeys("Farmhouse");

    }
}
