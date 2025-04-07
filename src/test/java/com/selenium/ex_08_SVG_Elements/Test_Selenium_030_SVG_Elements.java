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

public class Test_Selenium_030_SVG_Elements {

    EdgeDriver driver;



@BeforeTest
public void openBrowser(){
    EdgeOptions edgeOptions = new EdgeOptions();
    edgeOptions.addArguments("--guest");
    driver = new EdgeDriver(edgeOptions);
    driver.manage().window().maximize();
}


@Description("Verify that the on search with svg icon results are visible.")
@Test
public void test_Flipkart_Search_SVG_Icon(){
    driver.get("https://www.flipkart.com/search");
    WebElement webElement = driver.findElement(By.name("q"));
    webElement.sendKeys("macmini");

    List<WebElement> elementList = driver.findElements(By.xpath("//*[name() = 'svg']"));
    elementList.get(0).click();

    //you can also find xpath by including local- name() as given below
//    List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
//    svgElements.get(0).click();

    checkVisibility(driver,By.xpath("//div[contains (@data-id, \"CPU\")]/div/a[2]"));  // either use this or else use thread.sleep

//    wait_JVM(5000);

    List<WebElement> title_result = driver.findElements(By.xpath("//div[contains (@data-id, \"CPU\")]/div/a[2]"));
    for (WebElement title : title_result){
        System.out.println(title.getText());
    }
}


@AfterTest
public void closeBrowser(){
    wait_JVM(5000);
    driver.quit();
}
}