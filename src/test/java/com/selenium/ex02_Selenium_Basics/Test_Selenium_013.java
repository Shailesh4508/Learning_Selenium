package com.selenium.ex02_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;

public class Test_Selenium_013 {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com"); // HTTPs is important.

    }
}